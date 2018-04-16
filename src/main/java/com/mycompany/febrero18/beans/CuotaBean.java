/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.febrero18.beans;

import java.io.Serializable;
import javax.inject.Named;
import org.glassfish.jersey.process.internal.RequestScoped;

/**
 *
 * @author Ricardo
 */
@Named(value="cuotaBean")
@RequestScoped
public class CuotaBean implements Serializable{

    private int Partido;
    private int [] numeroPartidos = {2,3,4,5,6,7,8,9,10};
    private int numeroFallos;
    
    public CuotaBean() {
    }

    public int getPartido() {
        return Partido;
    }

    public void setPartido(int Partido) {
        this.Partido = Partido;
        numeroFallos = Partido - numeroFallos;
    }

    public int[] getNumeroPartidos() {
        return numeroPartidos;
    }

    public void setNumeroPartidos(int[] numeroPartidos) {
        this.numeroPartidos = numeroPartidos;
    }

    public int getNumeroFallos() {
        return numeroFallos;
    }

    public void setNumeroFallos(int numeroFallos) {
        this.numeroFallos = numeroFallos;
    }

    
    
    
}
