package com.mycompany.ws.action;

import com.mycompany.ws.bean.UsuarioBean;
import com.mycompany.ws.service.UsuarioService;
import com.mycompany.ws.service.UsuarioServiceImpl;
import com.mycompany.ws.util.Constantes;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LoginUsuarioAction extends ActionSupport implements SessionAware {

    private UsuarioBean usuarioBean;
    private String email, password;
    private Map<String,Object> session;
    private boolean estado = false;

    public String loginUsuario(){
        String vista = "";
        UsuarioService service = new UsuarioServiceImpl();
        try {
            usuarioBean = service.login(email,password);
        }catch (Exception e){
            e.printStackTrace();
        }

        if (usuarioBean != null){
            session.put("usuario",usuarioBean);
            vista = SUCCESS;
            addActionMessage(Constantes.LOGIN_SUCCESS);
            estado = true;
        }else {
            vista = LOGIN;
            addActionError(Constantes.LOGIN_ERROR);
        }

        return vista;
    }

    public String logoutUsuario(){
        if (session.containsKey("usuario")){
            session.remove("usuario");
        }
        return LOGIN;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
