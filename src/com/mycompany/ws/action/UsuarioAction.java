package com.mycompany.ws.action;

import com.mycompany.ws.bean.PerfilBean;
import com.mycompany.ws.bean.UsuarioBean;
import com.mycompany.ws.service.PerfilService;
import com.mycompany.ws.service.PerfilServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RUBITO on 07/05/2016.
 */
public class UsuarioAction extends ActionSupport {
    private UsuarioBean usuarioBean;
    private List<PerfilBean> listaPerfil = new ArrayList<>();
    private String mensaje;
    private PerfilService service;

    public String cargarRegistroUsuario() {
        service = new PerfilServiceImpl();
        try {
            listaPerfil = service.listarPerfil();
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
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
