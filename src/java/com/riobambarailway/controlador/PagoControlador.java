/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.controlador;

import com.riobambarailway.entidades.Ccompra;
import com.riobambarailway.entidades.Ccomprador;
import com.riobambarailway.entidades.Cpassenger;
import com.riobambarailway.modelo.MCompra;
import com.riobambarailway.modelo.Mcomprador;
import com.riobambarailway.modelo.Mpassenger;
import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.event.SelectEvent;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

/**
 *
 * @author William
 */
@ManagedBean
@RequestScoped
public class PagoControlador {

    private Cpassenger objpasajero;
    private Ccompra objcompra;
    private Ccomprador objcomprador;
    private Date date1;

    private Date date3;

    public PagoControlador() {
        this.objcompra = new Ccompra();
        this.objcomprador = new Ccomprador();
        this.objpasajero = new Cpassenger();
    }

    public Cpassenger getObjpasajero() {
        return objpasajero;
    }

    public void setObjpasajero(Cpassenger objpasajero) {
        this.objpasajero = objpasajero;
    }

    public Ccompra getObjcompra() {
        return objcompra;
    }

    public void setObjcompra(Ccompra objcompra) {
        this.objcompra = objcompra;
    }

    public Ccomprador getObjcomprador() {
        return objcomprador;
    }

    public void setObjcomprador(Ccomprador objcomprador) {
        this.objcomprador = objcomprador;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }

    public void redPassenger(){
        FacesContext context = FacesContext.getCurrentInstance();
        //context.getExternalContext().redirect("/passenger.xhtml");
    }

    public void insertarPago() throws IOException {
        
        try {
            MCompra.insertarCompra(objcompra);
            Mcomprador.insertarComprador(objcomprador);
            Mpassenger.insertarPassenger(objpasajero);
            /*objPersona.setObjSexo(Msexo.obtSexo(idSexo));
             String nombre = objPersona.getNombre();
             String apellido = objPersona.getApellido();
             usuario = String.valueOf(nombre.charAt(0) + "" + nombre.charAt(1) + "" + apellido.charAt(0) + "" + apellido.charAt(1));
             if (MPersona.insertarPersona(objPersona) && MPersona.insertarComentario(objComentario, objPersona) && MPersona.insertarCuenta(usuario, objPersona)) {
             //DefaultRequestContext.getCurrentInstance().execute("dlgPersonaInsertar.hide()");
             //Mensajes de confirmacion de la cuenta

             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Su cuenta se ha creado satisfactoriamente", "Su cuenta se a creado con el usuario =>   " + usuario + "y con la comstraseña tedx123");
             RequestContext.getCurrentInstance().showMessageInDialog(message);

             //Util.addSuccessMessage("Datos Insertados");
             //cargarFacultad();
             } else {
             Util.mostrarMensaje("Datos no insertados Insertados");
             }

             objPersona = null;*/
        } catch (Exception e) {
            //Util.addErrorMessage(e.getMessage());
        }

    }

}
