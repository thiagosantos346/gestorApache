/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.projetointegrador.gti.m.senac.go;

import entidade.projetointegrador.gti.m.senac.go.Hora;
import java.time.Clock;
import java.util.Timer;
import static javafx.util.Duration.seconds;

/**
 *
 * @author User
 */

/*

[day/month/year:hour:minute:second zone]
day = 2*digit
month = 3*letter
year = 4*digit
hour = 2*digit
minute = 2*digit
second = 2*digit
zone = (`+' | `-') 4*digit

*/

public class DataHora {
    
    private Data data;
    private Hora hora;

    public DataHora(Data data, Hora hora) {
        this.data = data;
        this.hora = hora;
    }
    
    public DataHora()
    {
    
    }


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    public String getDataStamp()
    {
    
        String dateRetorno;
        
        dateRetorno = this.data.getDia()+"/"+this.getData().getMes()+"/"+this.getData().getAno();
        
        return dateRetorno;
    }
    
    public String getTimeStamp()
    {
    
        String dateRetorno;
        
        dateRetorno = this.hora.getHoras()+"/"+this.hora.getMinutos()+"/"+this.hora.getSegundos();
        
        return dateRetorno;
    }
    
}
