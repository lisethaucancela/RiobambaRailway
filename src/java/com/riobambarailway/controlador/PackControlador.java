/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.controlador;

import com.riobambarailway.entidades.CPack;
import com.riobambarailway.modelo.MPack;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Liseth
 */
@ManagedBean
@RequestScoped
public class PackControlador {

    private CPack objPack;
    private List<CPack> lstPack;
    private List<CPack> lstPackSeleccionados;
    public int totalHoras;
    public double totalCosto;

    public PackControlador() {
        this.objPack = new CPack();
        this.lstPackSeleccionados = new ArrayList<CPack>();
    }

    @PostConstruct
    public void reinit() {
        cargarPack();
    }

    public void cargarPack() {
        try {
            lstPack = MPack.obtenerPack();
        } catch (Exception e) {
            System.err.println("e" + e.getMessage());
        }
    }

    public void seleccionados() {
        lstPackSeleccionados = new ArrayList<CPack>();
        totalHoras = 0;
        totalCosto = 0;
        for (CPack lst : lstPack) {
            if (lst.isElegido()) {
                lstPackSeleccionados.add(lst);
                totalHoras = totalHoras + lst.getHoras();
                totalCosto = totalCosto + lst.getCosto();
            }
        }
    }

    public CPack getObjPack() {
        return objPack;
    }

    public void setObjPack(CPack objPack) {
        this.objPack = objPack;
    }

    public List<CPack> getLstPack() {
        return lstPack;
    }

    public void setLstPack(List<CPack> lstPack) {
        this.lstPack = lstPack;
    }

    public List<CPack> getLstPackSeleccionados() {
        return lstPackSeleccionados;
    }

    public void setLstPackSeleccionados(List<CPack> lstPackSeleccionados) {
        this.lstPackSeleccionados = lstPackSeleccionados;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

  
}
