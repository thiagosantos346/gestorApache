/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.projetointegrador.gti.m.senac.go;

/**
 *
 * @author Thiago Silva
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FileHandle {

    private Path pathFile;
    private Charset charset;

    private int numberLines = 0;
    private int numberWords = 0;
    public int numberChars = 0;
    private int preSize = 0;
    
    Controle controle = new Controle();
    
    private ArrayList<String> wordList = new ArrayList();
    private ArrayList<String> wordListQuant = new ArrayList();
    private ArrayList<String> wordListSplit = new ArrayList();

    public FileHandle() {

        this.charset = StandardCharsets.ISO_8859_1;

    }

    public int getPreSize() {
        return preSize;
    }

    public ArrayList<String> getWordListQuant() {
        return wordListQuant;
    }

    public Path getPathFile() {
        return pathFile;
    }

    public Charset getCharset() {
        return charset;
    }

    public int getNumberChars() {
        return numberChars;
    }

    public void setCharset(int select) {

        Charset charSetSelect;

        switch (select) {
            case 1:
                charSetSelect = StandardCharsets.ISO_8859_1;
                break;

            case 2:
                charSetSelect = StandardCharsets.US_ASCII;
                break;

            case 3:
                charSetSelect = StandardCharsets.UTF_16;
                break;

            default:
                charSetSelect = StandardCharsets.UTF_8;

        }

        this.charset = charSetSelect;

    }

    public void setPathFile(String pathFile) {

        Path path = Paths.get(pathFile);//Recebendo caminho atraves do metodo e criado o objeto path
        this.pathFile = path; //atribuido o objeto criado ao objeto da classe
        this.preReadFile();
    }

    public void clear() {
        
        wordList.clear();
        wordListQuant.clear();
        wordListSplit.clear();
        this.numberLines = 0;
        this.numberWords = 0;
        this.numberChars = 0;

    }

    public int readFile(String split) {
        String line;
        String lineVetor[];
        
        clear();
        this.numberChars = 0;
        this.numberWords = 0;
        this.numberLines = 0;
        
        try (BufferedReader reader = Files.newBufferedReader(this.pathFile, this.charset)) {
            
            while (((line = reader.readLine()) != null)) {
                //somando o numero de caracteres
                this.numberChars += line.length();

                //somando o numero de linhas
                this.numberLines++;

                //dividindo uma string em sub strings
                lineVetor = line.split(split);

                this.numberWords += lineVetor.length;
                
                this.controle.read(lineVetor[0], lineVetor[1]);
                
                for(int a = 0; a < lineVetor.length; a++) {

                    if(!lineVetor[a].isEmpty()== true) {
                        this.wordListSplit.add(lineVetor[a]);
                       System.out.print(": " + lineVetor[a] + " :\n");

                    }

                }

                for(int i = 0; i < this.wordList.size(); i++) {
                    System.out.print("\n" + wordList.get(i));
                }

            }
            
            reader.close();

        } catch (IOException e) {
            
            this.setCharset(12);
            JOptionPane.showMessageDialog(null, "\n Erro: " + e.toString()+" CharSet Trocado Para Utf-8 Tente Abrir o Arquivo Novamente ");
        }
        return 100;
    }

    public void preReadFile() {
        String line;
        this.preSize = 0;
        try (BufferedReader reader = Files.newBufferedReader(this.pathFile, this.charset)) {

            while (((line = reader.readLine()) != null)) {

                this.preSize += line.length();

            }

            reader.close();

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "\n Erro: " + e.toString());
        }

    }

    public int getNumberLines() {
        return numberLines;
    }

    public int getNumberWords() {
        return numberWords;
    }

    public ArrayList<String> getWordList() {
        return wordList;
    }

    public ArrayList<String> getWordListSplit() {
        return wordListSplit;
    }

}
