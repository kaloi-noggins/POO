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
public class Retangulo extends Quadrado {
    
    private double comprimento;

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
