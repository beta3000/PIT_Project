package com.mycompany.ws.service;

import com.mycompany.ws.bean.PagoBean;

import java.util.List;

public interface PagoService {
    int registrarPago(PagoBean bean) throws Exception;

    int eliminarPago(int id) throws Exception;

    int actualizarPago(PagoBean bean) throws Exception;

    List<PagoBean> listarPago() throws Exception;

}
