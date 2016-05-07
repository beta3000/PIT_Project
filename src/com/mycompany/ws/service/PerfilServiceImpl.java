package com.mycompany.ws.service;

import com.mycompany.ws.bean.PerfilBean;
import com.mycompany.ws.dao.MySqlPerfilDAO;

import java.util.List;

/**
 * Created by RUBITO on 03/05/2016.
 */
public class PerfilServiceImpl implements PerfilService {

    MySqlPerfilDAO dao  = new MySqlPerfilDAO();

    @Override
    public int registrarPerfil(PerfilBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int eliminarPerfil(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualizarPerfil(PerfilBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<PerfilBean> listarPerfil() throws Exception {
        return dao.obtenTodo();
    }
}
