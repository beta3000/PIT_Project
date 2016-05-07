package com.mycompany.ws.action;

import com.mycompany.ws.bean.PerfilBean;
import com.mycompany.ws.service.PerfilService;
import com.mycompany.ws.service.PerfilServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;


public class PerfilAction extends ActionSupport {
    private String mensaje;
    private PerfilBean perfilBean;
    private List<PerfilBean> listaPerfil = new ArrayList<>();
    private PerfilService service;

    public PerfilBean getPerfilBean() {
        return perfilBean;
    }

    public void setPerfilBean(PerfilBean perfilBean) {
        this.perfilBean = perfilBean;
    }

    public List<PerfilBean> getListaPerfil() {
        return listaPerfil;
    }

    public void setListaPerfil(List<PerfilBean> listaPerfil) {
        this.listaPerfil = listaPerfil;
    }

    public String registrarPerfil() {
        service = new PerfilServiceImpl();
        int insertado = -1;
        try {
            insertado = service.registrarPerfil(perfilBean);
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

    public String listarPerfil() {
        service = new PerfilServiceImpl();
        try {
            listaPerfil = service.listarPerfil();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (listaPerfil != null) {
            mensaje = SUCCESS;
        } else {
            mensaje = ERROR;
        }

        return mensaje;
    }

    public String eliminarPerfil() {
        service = new PerfilServiceImpl();
        try {
            service.eliminarPerfil(perfilBean.getIdPerfil());
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String buscarPerfilPorID() {
        int perfil = -1;
        service = new PerfilServiceImpl();
        try {
            for (PerfilBean x : service.listarPerfil()
                    ) {
                if (x.getIdPerfil() == perfilBean.getIdPerfil()) {
                    perfilBean = x;
                }

            }
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String actualizarPerfil() {
        service = new PerfilServiceImpl();
        try {
            service.actualizarPerfil(perfilBean);
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }
}
