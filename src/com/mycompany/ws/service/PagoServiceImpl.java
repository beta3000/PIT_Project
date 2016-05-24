package com.mycompany.ws.service;


import com.mycompany.ws.bean.PagoBean;
import com.mycompany.ws.dao.MySqlPagoDAO;
import com.mycompany.ws.dao.PagoDAO;

import java.util.List;

public class PagoServiceImpl implements PagoService {

    private PagoDAO dao = new MySqlPagoDAO();

    @Override
    public int registrarPago(PagoBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int eliminarPago(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualizarPago(PagoBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<PagoBean> listarPago() throws Exception {
        return dao.obtenTodo();
    }
}
