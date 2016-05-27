package com.mycompany.ws.action;


import com.mycompany.ws.bean.CuotaBean;
import com.mycompany.ws.bean.ObligacionBean;
import com.mycompany.ws.bean.ProductoBean;
import com.mycompany.ws.bean.SocioBean;
import com.mycompany.ws.service.*;
import com.mycompany.ws.util.Funciones;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class ObligacionAction extends ActionSupport {
    private String mensaje;
    private ProductoService productoService;
    private ProductoBean productoBean;
    private String tasaProducto = "";//Pata mostrar la tasa antes de la tabla
    private List<ProductoBean> listaProducto = new ArrayList<>();
    private SocioService socioService;
    private List<SocioBean> listaSocio = new ArrayList<>();
    private SocioBean socioBean;
    private ObligacionBean obligacionBean;
    private ObligacionService obligacionService;
    private CuotaService cuotaService;
    private List<CuotaBean> listaCuota = new ArrayList<>();

    public String cargarFormularioObligacionInicial() {
        productoService = new ProductoServiceImpl();
        socioService = new SocioServiceIml();
        try {
            listaProducto = productoService.listarProducto();
            listaSocio = socioService.listarSocio();

            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String cargarCuotasObligacion() {
        productoService = new ProductoServiceImpl();
        socioService = new SocioServiceIml();
        System.out.println("Cuotas: " + obligacionBean.getNumeroCuotasObligacion());
        try {
            listaProducto = productoService.listarProducto();
            listaSocio = socioService.listarSocio();
            productoBean = productoService.buscarPorID(productoBean.getIdProducto());
            System.out.println("tasa: " + productoBean.getTasaProducto());
            listaCuota = Funciones.generarCuotas(obligacionBean.getNumeroCuotasObligacion(), productoBean);
            tasaProducto = "El Producto " + productoBean.getNombreProducto() +
                    " tiene una tasa anual del " + productoBean.getTasaProducto() + "% y tiene un costo de $" + productoBean.getPrecioProducto() + ".";
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String generarObligacionCuotas() {
        productoService = new ProductoServiceImpl();
        socioService = new SocioServiceIml();
        obligacionService = new ObligacionServiceImpl();
        try {
            productoBean = productoService.buscarPorID(productoBean.getIdProducto());
            obligacionBean.setProducto(productoBean);
            obligacionBean.setSocio(socioBean);
            obligacionBean.setFechaRegistroObligacion(Funciones.obtenerFechaActual());
            obligacionBean.setCuotas(Funciones.generarCuotasSinId(obligacionBean.getNumeroCuotasObligacion(), productoBean));
            obligacionService.registrarObligacion(obligacionBean);
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

    public List<SocioBean> getListaSocio() {
        return listaSocio;
    }

    public void setListaSocio(List<SocioBean> listaSocio) {
        this.listaSocio = listaSocio;
    }

    public ObligacionBean getObligacionBean() {
        return obligacionBean;
    }

    public void setObligacionBean(ObligacionBean obligacionBean) {
        this.obligacionBean = obligacionBean;
    }

    public String getTasaProducto() {
        return tasaProducto;
    }

    public void setTasaProducto(String tasaProducto) {
        this.tasaProducto = tasaProducto;
    }

    public SocioBean getSocioBean() {
        return socioBean;
    }

    public void setSocioBean(SocioBean socioBean) {
        this.socioBean = socioBean;
    }

    public List<CuotaBean> getListaCuota() {
        return listaCuota;
    }

    public void setListaCuota(List<CuotaBean> listaCuota) {
        this.listaCuota = listaCuota;
    }

}
