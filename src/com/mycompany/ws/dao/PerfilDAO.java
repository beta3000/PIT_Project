package com.mycompany.ws.dao;

import com.mycompany.ws.bean.PerfilBean;

import java.util.List;

interface PerfilDAO {
    int inserta(PerfilBean bean) throws Exception;

    int elimina(int id) throws Exception;

    int actualiza(PerfilBean bean) throws Exception;

    List<PerfilBean> obtenTodo() throws Exception;
}
