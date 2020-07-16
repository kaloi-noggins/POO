package universidade;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author caloi
 */
public class Blocos {
   
    private List<Salas> salas;
    private boolean estadoBloco;
    
    public Blocos(int numSalas, boolean estadoSalas){
        salas = new ArrayList<>();
        
        for(int i=0;i<numSalas;i++)
        {
            salas.set(i, new Salas(estadoSalas));
        }
    }
    
    public int numSalasLigadas(){
        int cont = 0;
        
        for(int i=0;i<salas.size();i++){
            if(salas.get(i).isEstadoSalas()){
                cont++;
            }
        }
        
        return cont;
    }
    
    public int numSalasDesligadas(){
        int cont = 0;
        
        for(int i=0;i<salas.size();i++){
            if(salas.get(i).isEstadoSalas()==false){
                cont++;
            }
        }
        
        return cont;
    }
    public void desligarBloco(){
         
        for(int i=0;i<salas.size();i++){
            salas.get(i).desligar();
        }
        
    }
    
    public void desligarSala(int numSala)
    {
        if(numSala<0 || numSala>salas.size())
        {
            System.out.println("Número de sala inválido");
        }else{
            salas.get(numSala).desligar();
        }
    }
    
    public boolean isEstadoBloco(){
        return estadoBloco;
    }
    
}
