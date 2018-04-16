/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.febrero18.dao;

import com.mycompany.febrero18.modelos.Cuota;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ricardo
 */
public class CuotaDAOImpl implements CuotaDAO{
    
    class CuotaRowMapper implements RowMapper{
    
        @Override
        public Object mapRow(ResultSet rs, int i)throws SQLException {
            return new Cuota(
                    rs.getInt("id"),
                    rs.getDouble("cuota1"),
                    rs.getDouble("cuota2"),
                    rs.getDouble("cuota3"),
                    rs.getDouble("cuota4")
            );
        } 
    }
    
    @Autowired
    DataSource dataSource;
    
    @Override
    public void insertar(Cuota c){
        String sql="insert into cuotas(cuota1,cuota2,cuota3,cuota4)values(?,?,?,?)";
        JdbcTemplate jdbc=new JdbcTemplate(dataSource);
        jdbc.update(sql,new Object[]{c.getCuota1(),c.getCuota2(),c.getCuota3(),c.getCuota4()});
        
    }
    @Override
    public List<Cuota> sumar(int id){
        Cuota c=null;
        
        String sql="SELECT (cuota1+cuota2+cuota3+cuota4) FROM cuotas where id=?";
        JdbcTemplate jdbc=new JdbcTemplate(dataSource);
         
        List<Cuota> l=jdbc.query(sql,new CuotaRowMapper(),new Object[]{id});
        return l;
    }
    
}