package com.mycompany.ws.dao;

import com.mycompany.ws.bean.SocioBean;

import java.util.List;

public interface SocioDAO {
    int inserta(SocioBean bean) throws Exception;

    int elimina(int id) throws Exception;

    int actualiza(SocioBean bean) throws Exception;

    List<SocioBean> obtenTodo() throws Exception;
}
