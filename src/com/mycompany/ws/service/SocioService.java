package com.mycompany.ws.service;

import com.mycompany.ws.bean.SocioBean;

import java.util.List;

public interface SocioService {
    int registrarSocio(SocioBean bean) throws Exception;

    int eliminarSocio(int id) throws Exception;

    int actualizarSocio(SocioBean bean) throws Exception;

    List<SocioBean> listarSocio() throws Exception;

    SocioBean login(String email, String password) throws Exception;
}
