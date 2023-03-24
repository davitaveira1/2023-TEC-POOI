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

public class Ex02 {

    public static void main(String[] args) {
        String nome, sobrenome, endereco, telefone, nomeCurso;
        double media;
        Scanner leia = new Scanner(System.in);

        //nome: next()
        System.out.println("Informe o nome:");
        nome = leia.next();
        //sobrenome: nextLine()
        leia.nextLine();
        
        System.out.println("Informe o sobrenome: ");
        sobrenome = leia.nextLine();
        
        //telefone: next()
        System.out.println("Informe o telefone: ");
        telefone = leia.next();
        
        //nomeCurso: nextLine()
        leia.nextLine();
        System.out.println("Informe o nome do curso: ");
        nomeCurso = leia.nextLine();
        
        //media: nextDouble()
        System.out.println("Informe a media: ");
        media = leia.nextDouble();
        
        //endereco: nextLine()
        leia.nextLine();
        System.out.println("Informe o endereco: ");
        endereco = leia.nextLine();
    }

}
