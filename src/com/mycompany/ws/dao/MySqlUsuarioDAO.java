package com.mycompany.ws.dao;

import com.mycompany.ws.bean.UsuarioBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MySqlUsuarioDAO implements UsuarioDAO {

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
    public int inserta(UsuarioBean bean) throws Exception {
        int insertado = -1;
        try (SqlSession session = sqlMapper.openSession()) {
            insertado = session.insert("idInsertaUsuario", bean);
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
            eliminado = session.delete("idDeleteUsuario", id);
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
    public int actualiza(UsuarioBean bean) throws Exception {
        int actualizado = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            actualizado = session.update("idUpdateUsuario", bean);
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
    public List<UsuarioBean> obtenTodo() throws Exception {
        List<UsuarioBean> lista = new ArrayList<>();
        try (SqlSession session = sqlMapper.openSession()) {
            lista = session.selectList("idSelectTodosUsuario");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
