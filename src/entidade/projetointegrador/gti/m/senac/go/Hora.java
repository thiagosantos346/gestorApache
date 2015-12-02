/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.projetoStringegrador.gti.m.senac.go;

/**
 *
 * @author User
 */
public class Hora {

    private String segundos;
    private String minutos;
    private String horas;
    private String utc;
    
    public Hora(String segundos, String minutos, String horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    public String getUtc() {
        return utc;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }

    
    
    public String getSegundos() {
        return segundos;
    }

    public String getMinutos() {
        return minutos;
    }

    public String getHoras() {
        return horas;
    }
    
    
    

}
