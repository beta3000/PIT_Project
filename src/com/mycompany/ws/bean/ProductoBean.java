package com.mycompany.ws.bean;

public class ProductoBean {
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;
    private String descripcionProducto;
    private double tasaProducto;

    public ProductoBean() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getTasaProducto() {
        return tasaProducto;
    }

    public void setTasaProducto(double tasaProducto) {
        this.tasaProducto = tasaProducto;
    }
}
