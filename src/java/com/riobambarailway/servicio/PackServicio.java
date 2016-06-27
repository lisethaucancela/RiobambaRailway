/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riobambarailway.servicio;

import com.riobambarailway.entidades.CPack;
import com.riobambarailway.entidades.PackVO;
import java.util.List;

/**
 *
 * @author Liseth
 */
public interface PackServicio {

    public List<PackVO> listarTodas();

    public void salvar(CPack pack);

    public List<CPack> listarTodasActivas();

    public CPack obterPorId(Integer id);

    public List<CPack> listarPorCurso(Integer id);


    public Long obterNumeroUltimaCPack();
}
