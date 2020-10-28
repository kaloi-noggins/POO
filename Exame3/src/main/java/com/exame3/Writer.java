package com.exame3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    void writeText(String text) {
        try {
            FileWriter writer = new FileWriter("resources/texto.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.flush();
            bw.write(text);
            bw.close();
        } catch (IOException ex) {
            System.out.println("Erro ao criar o arquivo");
        }
    }
    
}
