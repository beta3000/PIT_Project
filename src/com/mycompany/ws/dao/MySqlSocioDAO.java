package com.mycompany.ws.dao;


import com.mycompany.ws.bean.SocioBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MySqlSocioDAO implements SocioDAO {

    private SqlSessionFactory sqlMapper = null;

    {
        String archivo = "ConfiguracionIbatis.xml";
        try {
            Reader reader = Resources.getResourceAsReader(archivo);
            sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int inserta(SocioBean bean) throws Exception {
        int insertado = -1;
        try (SqlSession session = sqlMapper.openSession()) {
            insertado = session.insert("idInsertaSocio", bean);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return insertado;
    }

    @Override
    public int elimina(int id) throws Exception {
        int eliminado = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            eliminado = session.delete("idDeleteSocio", id);
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return eliminado;
    }

    @Override
    public int actualiza(SocioBean bean) throws Exception {
        int actualizado = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            actualizado = session.update("idUpdateSocio", bean);
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return actualizado;
    }

    @Override
    public List<SocioBean> obtenTodo() throws Exception {
        List<SocioBean> lista = new ArrayList<>();
        SqlSession session = sqlMapper.openSession();
        try {
            lista = session.selectList("idSelectTodosSocio");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return lista;
    }
}
