package com.mycompany.ws.service;

import com.mycompany.ws.bean.UsuarioBean;
import com.mycompany.ws.dao.MySqlUsuarioDAO;

import java.util.List;


public class UsuarioServiceImpl implements UsuarioService {

    private MySqlUsuarioDAO dao = new MySqlUsuarioDAO();


    @Override
    public int registrarUsuario(UsuarioBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int eliminarUsuario(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualizarUsuario(UsuarioBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<UsuarioBean> listarUsuario() throws Exception {
        return dao.obtenTodo();
    }
}
