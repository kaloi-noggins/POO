/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Timer timer1;
        TimerTask task1;
        
        System.out.print("Main!");
        
        (new Teste("um")).start();
        (new Teste("dois")).start();
        (new Teste("tres")).start();
        (new Teste("quatro")).start();
        
        
        timer1 =  new Timer();
        task1 = new TimerTask(){
            @Override
            public void run()
            {
                System.out.println(">>>CRACK<<<");
            }
        };
        timer1.schedule(task1,100,100);
    }
    
}
