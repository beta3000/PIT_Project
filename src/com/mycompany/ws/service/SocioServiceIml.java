package com.mycompany.ws.service;

import com.mycompany.ws.bean.SocioBean;
import com.mycompany.ws.dao.MySqlSocioDAO;
import com.mycompany.ws.dao.SocioDAO;

import java.util.List;

public class SocioServiceIml implements SocioService {

    private SocioDAO dao = new MySqlSocioDAO();

    @Override
    public int registrarSocio(SocioBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int eliminarSocio(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualizarSocio(SocioBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<SocioBean> listarSocio() throws Exception {
        return dao.obtenTodo();
    }

    @Override
    public SocioBean login(String email, String password) throws Exception {
        return null;
    }
}
