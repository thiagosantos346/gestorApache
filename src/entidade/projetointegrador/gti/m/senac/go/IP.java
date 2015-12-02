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
public class IP {
   
    private String primeiroBit;
    private String segundoBit;
    private String terceiroBit;
    private String quartoBit;
    private String  fullBits;
    
    public IP()
    {
    
    }

    public IP(String bit1, String bit2, String bit3, String bit4)
    {
        this.primeiroBit = bit1;
        this.segundoBit  = bit2;
        this.terceiroBit = bit3;
        this.quartoBit   = bit4;
        
        this.fullBits = bit1+"."+bit2+"."+bit3+"."+bit4;
        
    }
    
    public String getFullBits() {
        return fullBits;
    }
    
    public String getPrimeiroBit() {
        return primeiroBit;
    }

    public void setPrimeiroBit(String primeiroBit) {
        this.primeiroBit = primeiroBit;
    }

    public String getSegundoBit() {
        return segundoBit;
    }

    public void setSegundoBit(String segundoBit) {
        this.segundoBit = segundoBit;
    }

    public String getTerceiroBit() {
        return terceiroBit;
    }

    public void setTerceiroBit(String terceiroBit) {
        this.terceiroBit = terceiroBit;
    }

    public String getQuartoBit() {
        return quartoBit;
    }

    public void setQuartoBit(String quartoBit) {
        this.quartoBit = quartoBit;
    }
}
