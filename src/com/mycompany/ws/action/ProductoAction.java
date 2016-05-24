package com.mycompany.ws.action;

import com.mycompany.ws.bean.ProductoBean;
import com.mycompany.ws.service.ProductoService;
import com.mycompany.ws.service.ProductoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;


public class ProductoAction extends ActionSupport {
    private String mensaje;
    private ProductoBean productoBean;
    private List<ProductoBean> listaProducto = new ArrayList<>();
    private ProductoService service;

    public String registrarProducto() {
        service = new ProductoServiceImpl();
        int insertado = -1;
        try {
            insertado = service.registrarProducto(productoBean);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (insertado == -1) {
            mensaje = ERROR;
        } else {
            mensaje = SUCCESS;
        }
        return mensaje;
    }

    public String listarProducto() {
        service = new ProductoServiceImpl();
        try {
            listaProducto = service.listarProducto();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (listaProducto != null) {
            mensaje = SUCCESS;
        } else {
            mensaje = ERROR;
        }

        return mensaje;
    }

    public String eliminarProducto() {
        service = new ProductoServiceImpl();
        try {
            service.eliminarProducto(productoBean.getIdProducto());
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String buscarProductoPorID() {
        service = new ProductoServiceImpl();
        try {
            for (ProductoBean x : service.listarProducto()
                    ) {
                if (x.getIdProducto() == productoBean.getIdProducto()) {
                    productoBean = x;
                }

            }
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String actualizarProducto() {
        service = new ProductoServiceImpl();
        try {
            service.actualizarProducto(productoBean);
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    public List<ProductoBean> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<ProductoBean> listaProducto) {
        this.listaProducto = listaProducto;
    }
}
