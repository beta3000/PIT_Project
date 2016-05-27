package com.mycompany.ws.service;


import com.mycompany.ws.bean.ObligacionBean;
import com.mycompany.ws.dao.MySqlObligacionDAO;
import com.mycompany.ws.dao.ObligacionDAO;

import java.util.List;

public class ObligacionServiceImpl implements ObligacionService {

    private ObligacionDAO dao = new MySqlObligacionDAO();

    @Override
    public int registrarObligacion(ObligacionBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int eliminarObligacion(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualizarObligacion(ObligacionBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<ObligacionBean> listarObligacion() throws Exception {
        return dao.obtenTodo();
    }
}
