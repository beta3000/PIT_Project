package com.mycompany.ws.service;

import com.mycompany.ws.bean.UsuarioBean;

import java.util.List;

/**
 * Created by RUBITO on 07/05/2016.
 */
public interface UsuarioService {
    public abstract int registrarUsuario(UsuarioBean bean) throws Exception;

    public abstract int eliminarUsuario(int id) throws Exception;

    public abstract int actualizarUsuario(UsuarioBean bean) throws Exception;

    public abstract List<UsuarioBean> listarUsuario() throws Exception;
}
