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
    private List<UsuarioBean> listaUsuario = new ArrayList<>();
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

    public String listarUsuario() {
        usuarioService = new UsuarioServiceImpl();
        try {
            listaUsuario = usuarioService.listarUsuario();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (listaUsuario != null) {
            mensaje = SUCCESS;
        } else {
            mensaje = ERROR;
        }
        return mensaje;
    }

    public String eliminarUsuario() {
        usuarioService = new UsuarioServiceImpl();
        try {
            usuarioService.eliminarUsuario(usuarioBean.getIdUsuario());
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String buscarUsuarioPorId() {
        usuarioService = new UsuarioServiceImpl();
        perfilService = new PerfilServiceImpl();
        try {
            listaUsuario = usuarioService.listarUsuario();
            listaPerfil = perfilService.listarPerfil();
            for (UsuarioBean x : listaUsuario
                    ) {
                if (x.getIdUsuario() == usuarioBean.getIdUsuario()) {
                    usuarioBean = x;
                }
            }
            mensaje = SUCCESS;
        } catch (Exception e) {
            mensaje = ERROR;
            e.printStackTrace();
        }
        return mensaje;
    }

    public String actualizarUsuario() {
        usuarioService = new UsuarioServiceImpl();
        try {
            usuarioService.actualizarUsuario(usuarioBean);
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

    public List<UsuarioBean> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<UsuarioBean> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
}
