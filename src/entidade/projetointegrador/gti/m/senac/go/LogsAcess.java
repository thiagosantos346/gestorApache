/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.projetointegrador.gti.m.senac.go;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class LogsAcess {

    private ArrayList<Integer> idLineLog = new ArrayList();
    private Integer id = 0;
    private ArrayList<LineLog> line = new ArrayList();
    
    

    public void add(LineLog line) {
        this.idLineLog.add(id++);
        this.line.add(line);
        id++;
        
    }

    public ArrayList<Integer> getIdLineLog() {
        return idLineLog;
    }

    public ArrayList<LineLog> getLine() {
        return line;
    }

    
    
}
