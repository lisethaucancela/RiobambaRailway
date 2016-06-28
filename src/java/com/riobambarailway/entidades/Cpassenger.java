/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.entidades;

/**
 *
 * @author William
 */
public class Cpassenger {
     private String nombrePas;
    private String apellidoPas;
    private String idenTipoPas;
    private String indenNumPas;
    private String paisPas;

    public Cpassenger() {
    }

    public Cpassenger(String nombrePas, String apellidoPas, String idenTipoPas, String indenNumPas, String paisPas) {
        this.nombrePas = nombrePas;
        this.apellidoPas = apellidoPas;
        this.idenTipoPas = idenTipoPas;
        this.indenNumPas = indenNumPas;
        this.paisPas = paisPas;
    }

    public String getNombrePas() {
        return nombrePas;
    }

    public void setNombrePas(String nombrePas) {
        this.nombrePas = nombrePas;
    }

    public String getApellidoPas() {
        return apellidoPas;
    }

    public void setApellidoPas(String apellidoPas) {
        this.apellidoPas = apellidoPas;
    }

    public String getIdenTipoPas() {
        return idenTipoPas;
    }

    public void setIdenTipoPas(String idenTipoPas) {
        this.idenTipoPas = idenTipoPas;
    }

    public String getIndenNumPas() {
        return indenNumPas;
    }

    public void setIndenNumPas(String indenNumPas) {
        this.indenNumPas = indenNumPas;
    }

    public String getPaisPas() {
        return paisPas;
    }

    public void setPaisPas(String paisPas) {
        this.paisPas = paisPas;
    }
    
    
    
    
    
}
