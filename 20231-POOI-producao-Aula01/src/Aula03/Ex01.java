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
public class Ex01 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome;
        int idade;
        double peso;
        
        //escreva/leia para nome
        System.out.print("Informe nome: ");
        nome = leia.next();
        
        //escreva/leia para idade
        System.out.print("Informe idade: ");
        idade = leia.nextInt();
        
        //escreva/leia para peso
        System.out.print("Informe peso: ");
        peso = leia.nextDouble();
        
        System.out.println("O nome digitado é: "+nome);
        System.out.println("A idade digitada é: "+idade);
        System.out.println("O peso digitado é: "+peso);
        
    }
    
}
