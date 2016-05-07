package com.mycompany.ws.dao;

import com.mycompany.ws.bean.UsuarioBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * Created by RUBITO on 07/05/2016.
 */
public class MySqlUsuarioDAO implements UsuarioDAO {

    SqlSessionFactory sqlMapper = null;

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
        SqlSession session = sqlMapper.openSession();
        try {
            insertado = session.insert("idInsertaUsuario", bean);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return insertado;
    }

    @Override
    public int elimina(int id) throws Exception {
        return 0;
    }

    @Override
    public int actualiza(UsuarioBean bean) throws Exception {
        return 0;
    }

    @Override
    public List<UsuarioBean> obtenTodo() throws Exception {
        return null;
    }
}
