/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.projetointegrador.gti.m.senac.go;

import entidade.projetoStringegrador.gti.m.senac.go.CodigoHttp;
import entidade.projetoStringegrador.gti.m.senac.go.Hora;
import entidade.projetointegrador.gti.m.senac.go.Data;
import entidade.projetointegrador.gti.m.senac.go.DataHora;
import entidade.projetointegrador.gti.m.senac.go.IP;
import entidade.projetointegrador.gti.m.senac.go.LineLog;
import entidade.projetointegrador.gti.m.senac.go.LogsAcess;
import java.util.ArrayList;

/**
 *
 * @author User
 */

public class Controle {
    
    private LogsAcess logs = new LogsAcess();
    private LineLog line = new LineLog();
    //private FileHandle file = new FileHandle();

    public LogsAcess getLogs() {
        return logs;
    }

    public LineLog getLine() {
        return line;
    }

    public Controle() {
    }
    
    
    
    
    void read(String ipP, String dataP )
    {
        ArrayList<String> lineSplit = new ArrayList();
        //String ipS;
        String[] ipSV = new String[4];
        
        //file.setPathFile(path);
        //file.readFile("\\|");
        
        //lineSplit = file.getWordList();
        //ipS = lineSplit.get(0);
        
        ipSV = ipP.split("\\W");
       
        IP ip = new IP(ipSV[0], ipSV[1], ipSV[2], ipSV[3]);
        
        this.line.setIp(ip);
        
        line.setId();
        
        //String data = lineSplit.get(1);
        String[] dataS = dataP.split("\\W");
        
        Data dataV = new Data(dataS[0], dataS[1], dataS[2]);
        Hora hora = new Hora(dataS[3], dataS[4], dataS[5], dataS[6]);
        
        
        DataHora dataClock = new DataHora(dataV, hora);
        
        
        this.line.setTimestap(dataClock);
        
        //CodigoHttp statusHttp = new CodigoHttp(lineSplit.get(2));
        
        //this.line.setCodigo(statusHttp);
        
        
        
        //[27/Nov/2015:10:03:54 -0200] 
    }
    
    
   
    
    
}
