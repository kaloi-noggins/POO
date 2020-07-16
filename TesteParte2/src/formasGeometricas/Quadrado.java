package formasGeometricas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caloi
 */
public class Quadrado {
    
    protected double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double calcularArea()
    {
        return lado*lado;
    }
    
    public double getLado() {
        return lado;
    }
    
}
