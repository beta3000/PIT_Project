package com.mycompany.ws.dao;

import com.mycompany.ws.bean.PagoBean;

import java.util.List;

public interface PagoDAO {
    int inserta(PagoBean bean) throws Exception;

    int elimina(int id) throws Exception;

    int actualiza(PagoBean bean) throws Exception;

    List<PagoBean> obtenTodo() throws Exception;
}
