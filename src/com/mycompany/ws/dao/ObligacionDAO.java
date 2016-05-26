package com.mycompany.ws.dao;

import com.mycompany.ws.bean.ObligacionBean;

import java.util.List;

public interface ObligacionDAO {
    ObligacionBean inserta(ObligacionBean bean) throws Exception;

    int elimina(int id) throws Exception;

    int actualiza(ObligacionBean bean) throws Exception;

    List<ObligacionBean> obtenTodo() throws Exception;
}
