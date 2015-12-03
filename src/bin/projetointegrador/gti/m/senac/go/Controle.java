/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.projetointegrador.gti.m.senac.go;

import entidade.projetoStringegrador.gti.m.senac.go.CodigoHttp;
import entidade.projetointegrador.gti.m.senac.go.Hora;
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

    //public LineLog getLine() {
    //    return line;
    //}

    public Controle() {
    }
    
    
    
    
    void read(String IpParametro, String dataP )
    {
        
        String[] IpVetorSplit = new String[4];
        
        IpVetorSplit = IpParametro.split("\\W");
        IP ip = new IP(IpVetorSplit[0], IpVetorSplit[1], IpVetorSplit[2], IpVetorSplit[3]);
        this.line.setIp(ip); 
        line.setId();
        String[] dataS = dataP.split("\\W");
        
        for(int i=0; i < dataS.length; i++)
        {
            System.out.print("\n -> :"+dataS[i]);
        }
        
        Data dataVetor = new Data(dataS[2], dataS[3], dataS[4]);
        Hora hora = new Hora(dataS[5], dataS[6], dataS[7], dataS[9]);
        DataHora dataClock = new DataHora(dataVetor, hora);
        this.line.setTimestap(dataClock);
        
        logs.add(line);
        
    }
    
    
   
    
    
}
