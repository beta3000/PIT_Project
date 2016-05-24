package com.mycompany.ws.bean;


public class ObligacionBean {
    private int idObligacion;
    private String fechaRegistroObligacion;
    private int numeroCuptasObligacion;
    private SocioBean socio;
    private UsuarioBean usuario;
    private ProductoBean producto;

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

    public int getNumeroCuptasObligacion() {
        return numeroCuptasObligacion;
    }

    public void setNumeroCuptasObligacion(int numeroCuptasObligacion) {
        this.numeroCuptasObligacion = numeroCuptasObligacion;
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
}
