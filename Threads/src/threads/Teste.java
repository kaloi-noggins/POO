/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author caloi
 */
public class Teste extends Thread{
    private int contador = 0;
    private String nome ="";
    
    public Teste(String nome){
        this.nome = nome;
    }
    
    //@override
    public void run()
    {
        while(contador<1000){
            System.out.println(nome+" contando:"+contador);
            contador++;
        }
        System.out.print(nome+" terminou!");
    }
}
