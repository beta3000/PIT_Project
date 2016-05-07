package com.mycompany.ws.bean;

/**
 * Created by RUBITO on 03/05/2016.
 */
public class PerfilBean {
    private int idPerfil;
    private String nombrePerfil;
    private String descripcionPerfil;

    public PerfilBean() {
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getDescripcionPerfil() {
        return descripcionPerfil;
    }

    public void setDescripcionPerfil(String descripcionPerfil) {
        this.descripcionPerfil = descripcionPerfil;
    }
}
