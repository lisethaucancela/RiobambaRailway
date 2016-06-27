/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.modelo;
import com.riobambarailway.accesodatos.AccesoDatos;
import com.riobambarailway.accesodatos.ConjuntoResultado;
import com.riobambarailway.accesodatos.Parametro;
import com.riobambarailway.entidades.CPack;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Liseth
 */
public class MPack {

    public static CPack obtPack(int codigo) throws Exception {
        CPack objPack = null;
        try {
            ArrayList<Parametro> lstP = new ArrayList<>();
            String sql = "SELECT pack_id, pack_nombre, pack_detalle, pack_horas, pack_costo\n"
                    + "  FROM pack where pack_id = (?);";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                objPack = new CPack(rs.getInt(0),
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4));
            }
        } catch (SQLException e) {
            throw e;
        }
        return objPack;
    }

    public static ArrayList<CPack> obtenerPack() throws Exception {
        ArrayList<CPack> lstMaterial = new ArrayList<CPack>();
        try {
            String sql = "SELECT pack_id, pack_nombre, pack_detalle, pack_horas, pack_costo\n"
                    + "  FROM pack;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstMaterial = llenarPack(rs);
        } catch (SQLException exConec) {
            System.err.println("e" + exConec.getMessage());
            throw new Exception(exConec.getMessage());
        }
        return lstMaterial;
    }

    public static ArrayList<CPack> llenarPack(ConjuntoResultado rs) throws Exception {
        ArrayList<CPack> lstMaterial = new ArrayList<CPack>();
        CPack objMaterial = null;
        try {
            while (rs.next()) {
                objMaterial = new CPack(rs.getInt(0),
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4));
                lstMaterial.add(objMaterial);
            }
        } catch (Exception e) {
            lstMaterial.clear();
            System.err.println("e" + e.getMessage());
            throw e;
        }
        return lstMaterial;
    }
}
