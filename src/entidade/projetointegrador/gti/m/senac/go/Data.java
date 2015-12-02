/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.projetointegrador.gti.m.senac.go;


/**
 *
 * @author User
 */
//TODO validar data e hora
public class Data {

    private String dia;
    private String mes;
    private String hora;

    public Data(String dia, String mes, String hora) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;

    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getHora() {
        return hora;
    }
}
