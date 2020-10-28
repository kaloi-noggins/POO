package com.exame1;

public class Cubo extends Quadrado{

    public Cubo(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea(){
        return 6*(lado*lado);
    }
}
