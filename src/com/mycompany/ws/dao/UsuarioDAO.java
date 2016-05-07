package com.mycompany.ws.dao;

import com.mycompany.ws.bean.UsuarioBean;

import java.util.List;

/**
 * Created by RUBITO on 07/05/2016.
 */
public interface UsuarioDAO {
    public abstract int inserta(UsuarioBean bean) throws Exception;

    public abstract int elimina(int id) throws Exception;

    public abstract int actualiza(UsuarioBean bean) throws Exception;

    public abstract List<UsuarioBean> obtenTodo() throws Exception;
}
