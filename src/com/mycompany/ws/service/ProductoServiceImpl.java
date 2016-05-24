package com.mycompany.ws.service;


import com.mycompany.ws.bean.ProductoBean;
import com.mycompany.ws.dao.MySqlProductoDAO;
import com.mycompany.ws.dao.ProductoDAO;

import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    private ProductoDAO dao = new MySqlProductoDAO();

    @Override
    public int registrarProducto(ProductoBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int eliminarProducto(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualizarProducto(ProductoBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<ProductoBean> listarProducto() throws Exception {
        return dao.obtenTodo();
    }
}
