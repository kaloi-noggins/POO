package com.exame3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    String readText() {
        String result = "";
        try {
            FileReader file = new FileReader("resources/texto.txt");
            BufferedReader br = new BufferedReader(file);
            StringBuilder sb = new StringBuilder();
            try {
                String line = br.readLine();
                
                while(line != null)
                {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                result = sb.toString();
            } catch (IOException ex) {
                System.out.println("Erro ao ler o arquivo");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        }
        return result;
    }
}
