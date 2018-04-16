/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.febrero18.modelos;

import javax.validation.constraints.NotNull;
/**
 *
 * @author Ricardo
 */
public class Cuota {
    private int id;
    @NotNull
    private double cuota1;
    @NotNull
    private double cuota2;
    @NotNull
    private double cuota3;
    @NotNull
    private double cuota4;
    
    
    public Cuota() {
    }
    
    public Cuota(Cuota c) {
    }

    public Cuota(int id, double cuota1, double cuota2, double cuota3, double cuota4) {
        this.id = id;
        this.cuota1 = cuota1;
        this.cuota2 = cuota2;
        this.cuota3 = cuota3;
        this.cuota4 = cuota4;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCuota1() {
        return cuota1;
    }

    public void setCuota1(double cuota1) {
        this.cuota1 = cuota1;
    }

    public double getCuota2() {
        return cuota2;
    }

    public void setCuota2(double cuota2) {
        this.cuota2 = cuota2;
    }

    public double getCuota3() {
        return cuota3;
    }

    public void setCuota3(double cuota3) {
        this.cuota3 = cuota3;
    }

    public double getCuota4() {
        return cuota4;
    }

    public void setCuota4(double cuota4) {
        this.cuota4 = cuota4;
    }

    @Override
    public String toString() {
        return "Cuota{" + "id=" + id + ", cuota1=" + cuota1 + ", cuota2=" + cuota2 + ", cuota3=" + cuota3 + ", cuota4=" + cuota4 + '}';
    }
    
}
