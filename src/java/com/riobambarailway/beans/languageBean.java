/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.beans;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Liseth
 */
@ManagedBean
@SessionScoped
public class languageBean {

    private static final long serialVersionUID = 1L;
    private String localidad;
    private String language = "en";
    private static Map<String, Object> LstLocalidad;

    public languageBean() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Map<String, Object> getLstLocalidad() {
        return LstLocalidad;
    }

    public static void setLstLocalidad(Map<String, Object> LstLocalidad) {
        languageBean.LstLocalidad = LstLocalidad;
    }

    static {
        LstLocalidad = new LinkedHashMap<String, Object>();

        LstLocalidad.put("English", Locale.ENGLISH);
        LstLocalidad.put("Frances", Locale.FRENCH);
        Locale espanol = new Locale("ES");
        LstLocalidad.put("Español", espanol);
    }

    public void localidadChanges(ValueChangeEvent e) {
        String newLocalidadValue = e.getNewValue().toString();

        for (Map.Entry<String, Object> entry : LstLocalidad.entrySet()) {
            if (entry.getValue().toString().equals(newLocalidadValue)) {
                FacesContext.getCurrentInstance().getViewRoot()
                        .setLocale((Locale) entry.getValue());

            }
        }
    }

    public String actionEspañol() {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("es"));
        language = "es";
        return null;
    }

    public String actionEnglish() {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("en"));
        language = "en";
        return null;
    }
}
