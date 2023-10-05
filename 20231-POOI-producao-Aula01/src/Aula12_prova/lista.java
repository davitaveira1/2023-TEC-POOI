/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12_prova;

/**
 *
 * @author Davi
 */
public class lista {
    
    void valorFinal(double preco1, double qtd1, double preco2, double qtd2, double preco3, double qtd3){
        
        double valor = preco1 * qtd1;
        valor = valor + (preco2 * qtd2);
        valor = valor + (preco3 * qtd3);
        
    }
    
    public static void main(String[] args) {
        lista lista = new lista();
        
        lista.valorFinal(12.78, 411, 8.9, 333, 76.89, 123);
    }
    
}
