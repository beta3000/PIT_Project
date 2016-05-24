package com.mycompany.ws.bean;


public class CuotaBean {
    private int idCuota;
    private String fechaPagoCuota;
    private double montoCuota;
    private String estadoCuota;
    private ObligacionBean obligacion;

    public CuotaBean() {
    }

    public int getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(int idCuota) {
        this.idCuota = idCuota;
    }

    public String getFechaPagoCuota() {
        return fechaPagoCuota;
    }

    public void setFechaPagoCuota(String fechaPagoCuota) {
        this.fechaPagoCuota = fechaPagoCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public String getEstadoCuota() {
        return estadoCuota;
    }

    public void setEstadoCuota(String estadoCuota) {
        this.estadoCuota = estadoCuota;
    }

    public ObligacionBean getObligacion() {
        return obligacion;
    }

    public void setObligacion(ObligacionBean obligacion) {
        this.obligacion = obligacion;
    }
}
