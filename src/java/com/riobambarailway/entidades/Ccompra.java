/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.entidades;

import java.sql.Date;

/**
 *
 * @author William
 */
public class Ccompra {
    private CPack idPack;
    private Date fecha;
    private int cantidad;
    private int precioUnitario;
    private int precioTotal;
    private Ccomprador idComprador;

    public Ccompra() {
    }

    public Ccompra(CPack idPack, Date fecha, int cantidad, int precioUnitario, int precioTotal, Ccomprador idComprador) {
        this.idPack = idPack;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
        this.idComprador = idComprador;
    }

    public CPack getIdPack() {
        return idPack;
    }

    public void setIdPack(CPack idPack) {
        this.idPack = idPack;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Ccomprador getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Ccomprador idComprador) {
        this.idComprador = idComprador;
    }

    
}
