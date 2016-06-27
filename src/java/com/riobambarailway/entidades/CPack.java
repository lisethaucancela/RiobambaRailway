/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.entidades;

/**
 *
 * @author Liseth
 */
public class CPack {

    private int id;
    private String nombre;
    private String detalle;
    private int horas;
    private double costo;
    private boolean elegido;

    public CPack() {
    }


    public CPack(int id, String nombre, String detalle, int horas, double costo) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.horas = horas;
        this.costo = costo;
        elegido = false;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

  
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isElegido() {
        return elegido;
    }

    public void setElegido(boolean elegido) {
        this.elegido = elegido;
    }

  

}
