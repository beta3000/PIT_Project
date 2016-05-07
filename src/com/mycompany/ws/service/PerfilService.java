package com.mycompany.ws.service;

import com.mycompany.ws.bean.PerfilBean;

import java.util.List;

public interface PerfilService {
    int registrarPerfil(PerfilBean bean) throws Exception;

    int eliminarPerfil(int id) throws Exception;

    int actualizarPerfil(PerfilBean bean) throws Exception;

    List<PerfilBean> listarPerfil() throws Exception;
}
