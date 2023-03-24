/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Davi
 */
import java.util.Scanner;
public class Ex01 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        String sobrenome;
        
        System.out.print("Informe o nome: ");
        nome = leia.next();
        
        //resolvendo detalhe do nextLine();
        leia.nextLine();
        
        System.out.print("Informe o sobrenome: ");
        sobrenome = leia.nextLine();
        
        System.out.println(nome+" "+sobrenome);
    }
    
}
