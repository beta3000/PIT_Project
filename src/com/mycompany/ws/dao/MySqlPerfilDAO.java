package com.mycompany.ws.dao;

import com.mycompany.ws.bean.PerfilBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class MySqlPerfilDAO implements PerfilDAO {

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
    public int inserta(PerfilBean bean) throws Exception {
        int insertados = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            insertados = session.insert("idInsertaPerfil", bean);
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
        int eliminado = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            eliminado = session.delete("idDeletePerfil", id);
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
    public int actualiza(PerfilBean bean) throws Exception {
        int actualizado = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            actualizado = session.update("idUpdatePerfil", bean);
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
    public List<PerfilBean> obtenTodo() throws Exception {
        List<PerfilBean> lista = new ArrayList<>();
        try (SqlSession session = sqlMapper.openSession()) {
            lista = session.selectList("idSelectTodosPerfil");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

}
