package com.mycompany.ws.service;

import com.mycompany.ws.bean.CuotaBean;

import java.util.List;

public interface CuotaService {
    int registrarCuota(CuotaBean bean) throws Exception;

    int eliminarCuota(int id) throws Exception;

    int actualizarCuota(CuotaBean bean) throws Exception;

    List<CuotaBean> listarCuota() throws Exception;

}
