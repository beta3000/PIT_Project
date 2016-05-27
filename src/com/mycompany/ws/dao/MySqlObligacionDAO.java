package com.mycompany.ws.dao;


import com.mycompany.ws.bean.CuotaBean;
import com.mycompany.ws.bean.ObligacionBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MySqlObligacionDAO implements ObligacionDAO {
    private SqlSessionFactory sqlMapper = null;

    {
        String archivo = "ConfiguracionIbatis.xml";
        try {
            //Crear la conexion mediante Mybatis
            Reader reader = Resources.getResourceAsReader(archivo);

            //Session en Mybatis= conexion a BD
            sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int inserta(ObligacionBean bean) throws Exception {
        int insertados = 0;
        SqlSession session = sqlMapper.openSession();
        try {
            insertados += session.insert("idInsertaObligacion", bean);
            for (CuotaBean aux : bean.getCuotas()) {
                aux.setObligacion(bean);
                insertados += session.insert("idInsertaCuota", aux);
            }
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return insertados;
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
