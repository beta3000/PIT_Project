package com.mycompany.ws.action;


import com.mycompany.ws.bean.SocioBean;
import com.mycompany.ws.service.SocioService;
import com.mycompany.ws.service.SocioServiceIml;
import com.mycompany.ws.util.Funciones;
import com.opensymphony.xwork2.ActionSupport;

import static com.mycompany.ws.util.Constantes.IMAGEN_DEFECTO;

public class SocioAction extends ActionSupport {
    private String mensaje;
    private SocioBean socioBean;
    private SocioService socioService;

    //Imagen
    private String imagen;

    /*Actions*/
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
                imagen = imagen.substring(imagen.indexOf(',') + 1, imagen.length() - 1);
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
}
