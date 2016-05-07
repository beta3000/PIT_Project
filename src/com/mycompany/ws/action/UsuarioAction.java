package com.mycompany.ws.action;

import com.mycompany.ws.bean.PerfilBean;
import com.mycompany.ws.bean.UsuarioBean;
import com.mycompany.ws.service.PerfilService;
import com.mycompany.ws.service.PerfilServiceImpl;
import com.mycompany.ws.service.UsuarioService;
import com.mycompany.ws.service.UsuarioServiceImpl;
import com.mycompany.ws.util.Fecha;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;


public class UsuarioAction extends ActionSupport {
    private UsuarioBean usuarioBean;
    private List<PerfilBean> listaPerfil = new ArrayList<>();
    private String mensaje;
    private PerfilService perfilService;
    private UsuarioService usuarioService;

    public String cargarRegistroUsuario() {
        perfilService = new PerfilServiceImpl();
        try {
            listaPerfil = perfilService.listarPerfil();
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String registrarUsuario() {
        int insertado = -1;
        usuarioService = new UsuarioServiceImpl();
        try {
            usuarioBean.setEstadoUsuario("registrado");
            usuarioBean.setFechaRegistroUsuario(Fecha.obtenerFechaActual());

            insertado = usuarioService.registrarUsuario(usuarioBean);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (insertado == -1) {
            mensaje = ERROR;
        } else {
            mensaje = SUCCESS;
        }
        return mensaje;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public List<PerfilBean> getListaPerfil() {
        return listaPerfil;
    }

    public void setListaPerfil(List<PerfilBean> listaPerfil) {
        this.listaPerfil = listaPerfil;
    }

}
