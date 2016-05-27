package com.mycompany.ws.bean;


import java.util.List;

public class ObligacionBean {
    private int idObligacion;
    private String fechaRegistroObligacion;
    private int numeroCuotasObligacion;
    private SocioBean socio;
    private UsuarioBean usuario;
    private ProductoBean producto;
    private List<CuotaBean> cuotas;

    public ObligacionBean() {
    }

    public int getIdObligacion() {
        return idObligacion;
    }

    public void setIdObligacion(int idObligacion) {
        this.idObligacion = idObligacion;
    }

    public String getFechaRegistroObligacion() {
        return fechaRegistroObligacion;
    }

    public void setFechaRegistroObligacion(String fechaRegistroObligacion) {
        this.fechaRegistroObligacion = fechaRegistroObligacion;
    }

    public int getNumeroCuotasObligacion() {
        return numeroCuotasObligacion;
    }

    public void setNumeroCuotasObligacion(int numeroCuotasObligacion) {
        this.numeroCuotasObligacion = numeroCuotasObligacion;
    }

    public SocioBean getSocio() {
        return socio;
    }

    public void setSocio(SocioBean socio) {
        this.socio = socio;
    }

    public UsuarioBean getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }

    public ProductoBean getProducto() {
        return producto;
    }

    public void setProducto(ProductoBean producto) {
        this.producto = producto;
    }

    public List<CuotaBean> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<CuotaBean> cuotas) {
        this.cuotas = cuotas;
    }
}
