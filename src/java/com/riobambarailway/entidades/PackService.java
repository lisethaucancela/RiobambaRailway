/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liseth
 */
public class PackService {

    public List<CPack> createPacks(int p) {
        List<CPack> pack = new ArrayList<CPack>();
        for (int i = 0; i < p; i++) {
            pack.add(new CPack(p, "pack1","visita",5,4));
        }
        return pack;
    }

}
