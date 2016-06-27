/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.controlador;

import com.riobambarailway.entidades.CPack;
import com.riobambarailway.entidades.PackService;
import com.riobambarailway.servicio.PackServicio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author Liseth
 */
@ManagedBean
@ViewScoped
public class packView implements Serializable {

    @ManagedProperty("#{packService}")
    private PackService service;
    private List<CPack> packs;
    private List<CPack> droppedPack;
    private CPack selectedPack;

    private List<CPack> paquetes;
    private List<CPack> paquetesInseridas = new ArrayList<CPack>();
    private List<CPack> paquetesSelecionadas;

    private PackServicio packServicio;
    
    public packView() {
    }
    
    public void iniciarBean(){
        paquetes = packServicio.listarTodasActivas();
    }

    @PostConstruct
    public void init() {
        CPack obj = new CPack(1, "pack1","visita", 5, 4.2);
        packs.add(obj);
        droppedPack = new ArrayList<CPack>();
    }

    public void onPackDrop(DragDropEvent event) {
        CPack paquete = ((CPack) event.getData());
        paquetesInseridas.add(paquete);
        paquetes.remove(paquete);
    }

    public void setService(PackService service) {
        this.service = service;
    }

    public List<CPack> getPacks() {
        return packs;
    }

    public void setPacks(List<CPack> packs) {
        this.packs = packs;
    }

    public List<CPack> getDroppedPack() {
        return droppedPack;
    }

    public void setDroppedPack(List<CPack> droppedPack) {
        this.droppedPack = droppedPack;
    }

    public CPack getSelectedPack() {
        return selectedPack;
    }

    public void setSelectedPack(CPack selectedPack) {
        this.selectedPack = selectedPack;
    }
}
