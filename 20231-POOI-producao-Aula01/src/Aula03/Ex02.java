/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author Davi
 */

import java.util.Scanner;
public class Ex02 {
    
    public static void main(String[] args) {
        String nome,sobrenome;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Nome: ");
        nome = leia.next();
        
        System.out.println("Sobrenome: ");
        sobrenome = leia.next();
        
        System.out.println(nome+" "+sobrenome);
        
    }
    
}
