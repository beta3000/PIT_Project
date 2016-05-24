package com.mycompany.ws.dao;

import com.mycompany.ws.bean.CuotaBean;

import java.util.List;

public interface CuotaDAO {
    int inserta(CuotaBean bean) throws Exception;

    int elimina(int id) throws Exception;

    int actualiza(CuotaBean bean) throws Exception;

    List<CuotaBean> obtenTodo() throws Exception;
}
