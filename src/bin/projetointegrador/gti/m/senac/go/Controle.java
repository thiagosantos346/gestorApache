/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.projetointegrador.gti.m.senac.go;

import entidade.projetointegrador.gti.m.senac.go.IP;
import entidade.projetointegrador.gti.m.senac.go.LineLog;
import entidade.projetointegrador.gti.m.senac.go.LogsAcess;
import java.util.ArrayList;

/**
 *
 * @author User
 */

public class Controle {
    
    LogsAcess logs = new LogsAcess();
    LineLog line = new LineLog();
    FileHandle file = new FileHandle();
    
    
    void read(String split, String path )
    {
        ArrayList<String> lineSplit = new ArrayList();
        String ipS;
        String[] ipSV = new String[4];
        
        file.setPathFile(path);
        file.readFile("\\|");
        
        lineSplit = file.getWordList();
        ipS = lineSplit.get(0);
        
        ipSV = ipS.split(".");
       
        IP ip = new IP(ipSV[0], ipSV[1], ipSV[2], ipSV[3]);
        
        line.setId();
        
        line.setIp(ip);
        
    }
    
    
   
    
    
}
