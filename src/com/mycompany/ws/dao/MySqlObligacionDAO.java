package com.mycompany.ws.dao;


import com.mycompany.ws.bean.ObligacionBean;

import java.util.List;

public class MySqlObligacionDAO implements ObligacionDAO {
    @Override
    public ObligacionBean inserta(ObligacionBean bean) throws Exception {
        return null;
    }

    @Override
    public int elimina(int id) throws Exception {
        return 0;
    }

    @Override
    public int actualiza(ObligacionBean bean) throws Exception {
        return 0;
    }

    @Override
    public List<ObligacionBean> obtenTodo() throws Exception {
        return null;
    }
}
