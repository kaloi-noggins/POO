import java.util.Scanner;
import lista1.*;

public class Lista1 {
    
    public static void main(String args[]){
        
        do{
            System.out.println("Entre com o número do exercício (de 1 até 9) ou -1 para encerrar o programa: ");

            int ex = 0;
            Scanner scanner = new Scanner(System.in);

            do{

                ex = scanner.nextInt();

                switch(ex){
                    
                    case 1:
                        Ex1 ex1 = new Ex1();
                        ex1.resolver();
                        ex1 = null;
                    break;
                        
                    case 2:
                        Ex2 ex2 = new Ex2();
                        ex2.resolver();
                        ex2 = null;
                    break;
                    
                    case 3:
                        Ex3 ex3 = new Ex3();
                        ex3.resolver();
                        ex3 = null;
                    break;
                    
                    case 4:
                        Ex4 ex4 = new Ex4();
                        ex4.resolver();
                        ex4 = null;
                    break;
                    
                    case 5:
                        Ex5 ex5 = new Ex5();
                        ex5.resolver();
                        ex5 = null;
                    break;
                    
                    case 6:
                        Ex6 ex6 = new Ex6();
                        ex6.resolver();
                        ex6 = null;
                    break;
                    
                    case 7:
                        Ex7 ex7 = new Ex7();
                        ex7.resolver();
                        ex7 = null;
                    break;
                    
                    case 8:
                        Ex8 ex8 = new Ex8();
                        ex8.resolver();
                        ex8 = null;
                    break;
                    
                    case 9:
                        Ex9 ex9 = new Ex9();
                        ex9.resolver();
                        ex9 = null;
                    break;
                    
                    case -1:
                        System.out.println("Até mais!");
                        System.exit(0);
                    break;
                    
                    default:
                        System.out.println("Entre com um valor adequado");
                    break;
                }
                
                //evoca o coletor de lixo do java para remover a instância do exercício nulla22
                System.gc();
            }while(ex==0);
        
        }while(true);
   
    }
}
