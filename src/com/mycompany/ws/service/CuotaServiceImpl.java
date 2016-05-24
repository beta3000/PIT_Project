package com.mycompany.ws.service;


import com.mycompany.ws.bean.CuotaBean;
import com.mycompany.ws.dao.CuotaDAO;
import com.mycompany.ws.dao.MySqlCuotaDAO;

import java.util.List;

public class CuotaServiceImpl implements CuotaService {

    private CuotaDAO dao = new MySqlCuotaDAO();

    @Override
    public int registrarCuota(CuotaBean bean) throws Exception {
        return dao.inserta(bean);
    }

    @Override
    public int eliminarCuota(int id) throws Exception {
        return dao.elimina(id);
    }

    @Override
    public int actualizarCuota(CuotaBean bean) throws Exception {
        return dao.actualiza(bean);
    }

    @Override
    public List<CuotaBean> listarCuota() throws Exception {
        return dao.obtenTodo();
    }
}
