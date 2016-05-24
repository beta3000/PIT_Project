package com.mycompany.ws.dao;

import com.mycompany.ws.bean.ProductoBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MySqlProductoDAO implements ProductoDAO {

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
    public int inserta(ProductoBean bean) throws Exception {
        int insertados = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            insertados = session.insert("idInsertaProducto", bean);
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
            eliminado = session.delete("idDeleteProducto", id);
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
    public int actualiza(ProductoBean bean) throws Exception {
        int actualizado = -1;
        SqlSession session = sqlMapper.openSession();
        try {
            actualizado = session.update("idUpdateProducto", bean);
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
    public List<ProductoBean> obtenTodo() throws Exception {
        List<ProductoBean> lista = new ArrayList<>();
        SqlSession session = sqlMapper.openSession();
        try {
            lista = session.selectList("idSelectTodosProducto");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return lista;
    }
}
