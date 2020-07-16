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
public class Cubo extends Quadrado{

    public Cubo(double lado) {
        super(lado);
    }
    
    @Override
    public double calcularArea(){
        return 6*(lado*lado);
    }
}
