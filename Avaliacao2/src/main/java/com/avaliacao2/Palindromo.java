/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao2;

/**
 *
 * @author caloi
 */
public class Palindromo {

    public boolean isPalindromo(String s)
    {
        String original = s.replaceAll("\\s+","");
        char[] temp = original.toCharArray();
        
        String reverse = "";
        
        for(int i = (temp.length -1 ); i>=0; i--)
        {
            reverse += temp[i];
        }
        return original.equalsIgnoreCase(reverse);
    }
}
