package com.mycompany.ws.service;

import com.mycompany.ws.bean.UsuarioBean;

import java.util.List;


public interface UsuarioService {
    int registrarUsuario(UsuarioBean bean) throws Exception;

    int eliminarUsuario(int id) throws Exception;

    int actualizarUsuario(UsuarioBean bean) throws Exception;

    List<UsuarioBean> listarUsuario() throws Exception;

    UsuarioBean login(String email, String password) throws Exception;
}
