package com.exame1;

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