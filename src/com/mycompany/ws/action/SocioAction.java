package com.mycompany.ws.action;


import com.mycompany.ws.bean.SocioBean;
import com.mycompany.ws.service.SocioService;
import com.mycompany.ws.service.SocioServiceIml;
import com.mycompany.ws.util.Funciones;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

import static com.mycompany.ws.util.Constantes.IMAGEN_DEFECTO;

public class SocioAction extends ActionSupport {
    private String mensaje;
    private SocioBean socioBean;
    private List<SocioBean> listaSocio = new ArrayList<>();
    private SocioService socioService;

    //Imagen
    private String imagen;

    /*Action registrarSocio*/
    public String registraSocio() {
        int insertado = -1;
        socioService = new SocioServiceIml();

        //Comprobar si se ha enviado una captura
        if (imagen.equals(IMAGEN_DEFECTO)) {
            mensaje = "noWebCam";
            return mensaje;
        } else {
            try {
                socioBean.setFechaRegistroSocio(Funciones.obtenerFechaActual());
                socioBean.setPasswordSocio(Funciones.obtenerPasswordUsuario(socioBean.getNombreSocio(), socioBean.getApellidoSocio()));

                /*Imagen Base 64*/
                socioBean.setImagenSocioBase64(imagen);

                /*Huella*/
                socioBean.setImagenHuellaSocio(Funciones.obtenerHuella());

                /*Firma*/
                socioBean.setImagenFirmaSocio(Funciones.obtenerFirma());

                insertado = socioService.registrarSocio(socioBean);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (insertado == -1) {
                mensaje = ERROR;
            } else {
                mensaje = SUCCESS;
            }
        }
        return mensaje;
    }

    /*Action ListarSocio*/
    public String listarSocio() {
        socioService = new SocioServiceIml();
        try {
            listaSocio = socioService.listarSocio();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (listaSocio != null) {
            mensaje = SUCCESS;
        } else {
            mensaje = ERROR;
        }

        return mensaje;
    }

    /*Action EliminarSocio*/
    public String eliminarSocio() {
        socioService = new SocioServiceIml();
        try {
            socioService.eliminarSocio(socioBean.getIdSocio());
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    /*Action BuscarSocioPorId*/
    public String buscarSocioPorId() {
        socioService = new SocioServiceIml();
        try {
            listaSocio = socioService.listarSocio();
            for (SocioBean x : listaSocio) {
                if (x.getIdSocio() == socioBean.getIdSocio()) {
                    socioBean = x;
                }
            }
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    /*Action ActualizarSocio*/
    public String actualizarSocio() {
        socioService = new SocioServiceIml();
        try {
            socioService.actualizarSocio(socioBean);
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public SocioBean getSocioBean() {
        return socioBean;
    }

    public void setSocioBean(SocioBean socioBean) {
        this.socioBean = socioBean;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<SocioBean> getListaSocio() {
        return listaSocio;
    }

    public void setListaSocio(List<SocioBean> listaSocio) {
        this.listaSocio = listaSocio;
    }
}
