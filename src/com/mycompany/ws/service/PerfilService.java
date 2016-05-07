package com.mycompany.ws.service;

import com.mycompany.ws.bean.PerfilBean;

import java.util.List;

/**
 * Created by RUBITO on 03/05/2016.
 */
public interface PerfilService {
    public abstract int registrarPerfil(PerfilBean bean) throws Exception;
    public abstract int eliminarPerfil(int id) throws Exception;
    public abstract int actualizarPerfil(PerfilBean bean) throws Exception;
    public abstract List<PerfilBean> listarPerfil() throws Exception;
}
