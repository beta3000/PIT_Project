package com.mycompany.ws.bean;


public class PagoBean {
    private int idPago;
    private String fechaRegistroPago;
    private double montoPago;
    private String metodoPago;
    private CuotaBean cuota;
    private UsuarioBean usuario;

    public PagoBean() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getFechaRegistroPago() {
        return fechaRegistroPago;
    }

    public void setFechaRegistroPago(String fechaRegistroPago) {
        this.fechaRegistroPago = fechaRegistroPago;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public CuotaBean getCuota() {
        return cuota;
    }

    public void setCuota(CuotaBean cuota) {
        this.cuota = cuota;
    }

    public UsuarioBean getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }
}

