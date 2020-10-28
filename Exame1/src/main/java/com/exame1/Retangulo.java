package com.exame1;

public class Retangulo extends Quadrado {
    
    private final double comprimento;

    @Override
    public double calcularArea(){
        return lado*comprimento;
    }
    
    public double getComprimento() {
        return comprimento;
    }
    
    public Retangulo(double lado, double comprimento){
        super(lado);
        this.comprimento = comprimento;
    }
    
}
