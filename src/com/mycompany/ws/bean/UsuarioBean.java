package com.mycompany.ws.bean;


public class UsuarioBean {
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String fechaRegistroUsuario;
    private String emailUsuario;
    private String passwordUsuario;
    private byte[] imagenUsuario;
    private String imagenUsuarioBase64;
    private PerfilBean perfilUsuario;

    public UsuarioBean() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getFechaRegistroUsuario() {
        return fechaRegistroUsuario;
    }

    public void setFechaRegistroUsuario(String fechaRegistroUsuario) {
        this.fechaRegistroUsuario = fechaRegistroUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public PerfilBean getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(PerfilBean perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public byte[] getImagenUsuario() {
        return imagenUsuario;
    }

    public void setImagenUsuario(byte[] imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }

    public String getImagenUsuarioBase64() {
        return imagenUsuarioBase64;
    }

    public void setImagenUsuarioBase64(String imagenUsuarioBase64) {
        this.imagenUsuarioBase64 = imagenUsuarioBase64;
    }
}
