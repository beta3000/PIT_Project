package com.mycompany.ws.service;

import com.mycompany.ws.bean.UsuarioBean;
import com.mycompany.ws.dao.MySqlUsuarioDAO;
import com.mycompany.ws.dao.UsuarioDAO;

import java.util.List;

/**
 * Created by RUBITO on 07/05/2016.
 */
public class UsuarioServiceImpl implements UsuarioDAO {

    MySqlUsuarioDAO dao = new MySqlUsuarioDAO();

    @Override
    public int inserta(UsuarioBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int elimina(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualiza(UsuarioBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<UsuarioBean> obtenTodo() throws Exception {
        return dao.obtenTodo();
    }
}
