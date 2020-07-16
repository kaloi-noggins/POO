package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex1 {
   
    public void resolver(){
        
        System.out.println("Entre com um intervalo [a,b], com a>=b:");
        Scanner scanner = new Scanner(System.in);
        
        int intervalo[] = new int[2];
        
        for (int i=0; i < intervalo.length; i++){
           intervalo[i] = scanner.nextInt();
        }  
        
        List<Integer> primos = new ArrayList<Integer>();
        
        for(int i=intervalo[0]; i<intervalo[1]; i++)
        {
            if (checaPrimalidade(i)){
                primos.add(i);
            }
        }

        if(primos.size()>0){
            System.out.println("Primos achados no intervalo: "+ primos);
        }else{
            System.out.println("Nenhum primo foi encontrado no intervalo");
        }
    }
    
    private boolean checaPrimalidade(int n)
    {
        if(n<1){
            return false;
        }
        
        for(int i=2; i!=n; i++)
        {
            if(n%i==0){
                return false;
            }
        }
        
       return true;
    }
    
}
