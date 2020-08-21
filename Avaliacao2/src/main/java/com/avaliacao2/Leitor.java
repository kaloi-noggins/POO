/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author caloi
 */
public class Leitor {
    
    public String[] getLines()
    {
        ArrayList<String> lines = new ArrayList<>();
        try { 
           FileReader file = new FileReader("resources/questao1.txt");
           BufferedReader fileRead = new BufferedReader(file);
           String line = "";
            try {
                line = fileRead.readLine();
                while(line!=null)
                {
                    lines.add(line);
                    line = fileRead.readLine();
                }
            } catch (IOException ex) {
                System.out.println("Erro na leitura do arquivo");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        }
        
        String[] result = new String[lines.size()];
        
        for(int i=0; i<lines.size();i++)
        {
            result[i] = lines.get(i);
        }
        
        return result;
    }
}
