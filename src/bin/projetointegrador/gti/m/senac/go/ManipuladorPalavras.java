
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.projetointegrador.gti.m.senac.go;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thiag
 */
public class ManipuladorPalavras {

    private Modelo formulario = new Modelo();

    public Modelo getFormulario() {
        return formulario;
    }
    
    public void clearAll()
    {
        
    }

    public void run(String[] param) {
        
        
        formulario.clear();
        
        
        SelecionarPalavras run = new SelecionarPalavras();
        int t = param.length;
        String[] listaPalavras = param;

        String[] novaListaPalavras = new String[t];
        ArrayList<String> newArray = new ArrayList();
        ArrayList<Integer> newArrayId = new ArrayList();

        Integer[] quantidadeItemPalvra = new Integer[t];

        newArray = run.runN(param);
        Collections.sort(newArray);
        int size = newArray.size();

        for (int j = 0; j < size; j++) {

            int cont = 0;

            for (int x = 0; x < param.length; x++) {
                
                if(newArray.get(j).equals(param[x]))
                {
                    cont++;
                    newArrayId.add(j, cont);
                }
                
            }
        }
        
        for(int i = 0; i < newArray.size(); i++ )
        {
            formulario.setPalavra(newArray.get(i));
            formulario.setQuantidade(newArrayId.get(i));
        }
    }

}
