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

public class LineLog{
    
    private Integer id = 0;
    private IP ip;
    private DataHora timestap;
    private CodigoHttp codigo;
    private String headerHttp;

    public LineLog(IP ip, DataHora timestap, CodigoHttp codigo, String headerHttp) {
        this.id = id++;
        this.ip = ip;
        this.timestap = timestap;
        this.codigo = codigo;
        this.headerHttp = headerHttp;
    }

    
    
    public LineLog() {
      
    }

    public void setId() {
        this.id++;
    }
    
    public void setIp(IP ip) {
        this.ip = ip;
    }

    public void setTimestap(DataHora timestap) {
        this.timestap = timestap;
    }

    public void setCodigo(CodigoHttp codigo) {
        this.codigo = codigo;
    }

    public void setHeaderHttp(String headerHttp) {
        this.headerHttp = headerHttp;
    }

    
    public Integer getId() {
        return id;
    }

    public IP getIp() {
        return ip;
    }

    public DataHora getTimestap() {
        return timestap;
    }

    public CodigoHttp getCodigo() {
        return codigo;
    }

    
}
