package com.mycompany.ws.dao;

import com.mycompany.ws.bean.ProductoBean;

import java.util.List;

public interface ProductoDAO {
    int inserta(ProductoBean bean) throws Exception;

    int elimina(int id) throws Exception;

    int actualiza(ProductoBean bean) throws Exception;

    List<ProductoBean> obtenTodo() throws Exception;
}
