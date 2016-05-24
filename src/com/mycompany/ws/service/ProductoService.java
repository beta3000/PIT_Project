package com.mycompany.ws.service;

import com.mycompany.ws.bean.ProductoBean;

import java.util.List;

public interface ProductoService {
    int registrarProducto(ProductoBean bean) throws Exception;

    int eliminarProducto(int id) throws Exception;

    int actualizarProducto(ProductoBean bean) throws Exception;

    List<ProductoBean> listarProducto() throws Exception;

}
