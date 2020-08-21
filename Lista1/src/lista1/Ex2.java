/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author caloi
 */
public class Ex2 {

    public void resolver() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com a primeira lista de 10 números, separados por espaços:");
        int[] v1 = new int[10];
       
        for(int i=0;i<9;i++)
        {
            v1[i]= scanner.nextInt();
        }
         
        System.out.println("Entre com a segunda lista de 10 números, separados por espaços:");
        int[] v2 = new int[10];
       
        for(int i=0;i<9;i++)
        {
            v2[i]= scanner.nextInt();
        }
        
        int[] v3 = new int[10];
        
        for(int i = 0; i<9;i++)
        {
            if(v1[i]%2==0 && v2[i]==0)
            {
                v3[i] = v1[i] + v2[i];
            }else if(v1[i]%2!=0 && v2[i]!=0)
            {
                v3[i] = v1[i] - v2[i];
            }else{
                v3[i] = v1[i] * v2[i];
            }
        }
        
        System.out.println(Arrays.toString(v3));
    }
    
}
