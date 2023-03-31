/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class bolo {
    
    String sabor;
    double preco;
    double tamanho;
    
    public static void main(String[] args) {
        //criando o objeto
        bolo boloDoDavi;
        //criando o espaço na memória
        boloDoDavi = new bolo();
        
        boloDoDavi.sabor="chocolate";
        boloDoDavi.preco=10;
        boloDoDavi.tamanho=0.5;
        
        System.out.println("O sabor do bolo é: "+boloDoDavi.sabor);
    }
    
}
