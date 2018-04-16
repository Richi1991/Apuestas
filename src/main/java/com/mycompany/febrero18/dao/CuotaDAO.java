/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.febrero18.dao;

import com.mycompany.febrero18.modelos.Cuota;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public interface CuotaDAO {
    
    public void insertar(Cuota c);
    
    public List<Cuota> sumar(int id);
}
