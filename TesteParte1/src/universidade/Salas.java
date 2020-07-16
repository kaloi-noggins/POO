/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

/**
 *
 * @author caloi
 */
public class Salas {
    
    private boolean estadoSalas;
    
    public Salas(boolean estado){
        this.estadoSalas = estado;
    }

    public boolean isEstadoSalas() {
        return estadoSalas;
    }
    
    public void desligar()
    {
        this.estadoSalas = false;
    }
    
    public void ligar(){
        this.estadoSalas = true;
    }
}
