package com.mycompany.ws.dao;

import com.mycompany.ws.bean.UsuarioBean;

import java.util.List;


public interface UsuarioDAO {
    int inserta(UsuarioBean bean) throws Exception;

    int elimina(int id) throws Exception;

    int actualiza(UsuarioBean bean) throws Exception;

    List<UsuarioBean> obtenTodo() throws Exception;
}
