package com.mycompany.ws.service;

import com.mycompany.ws.bean.ObligacionBean;

import java.util.List;

public interface ObligacionService {
    int registrarObligacion(ObligacionBean bean) throws Exception;

    int eliminarObligacion(int id) throws Exception;

    int actualizarObligacion(ObligacionBean bean) throws Exception;

    List<ObligacionBean> listarObligacion() throws Exception;

}
