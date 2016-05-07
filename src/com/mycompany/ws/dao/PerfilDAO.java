package com.mycompany.ws.dao;

import com.mycompany.ws.bean.PerfilBean;

import java.util.List;

/**
 * Created by RUBITO on 03/05/2016.
 */
public interface PerfilDAO {
    public abstract int inserta(PerfilBean bean) throws Exception;
    public abstract int elimina(int id) throws Exception;
    public abstract int actualiza(PerfilBean bean) throws Exception;
    public abstract List<PerfilBean> obtenTodo() throws Exception;
}
