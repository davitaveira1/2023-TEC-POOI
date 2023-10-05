/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12_prova;

/**
 *
 * @author Davi
 */
public class conta {
    
    double saldo;
    
    void creditar(double valor){
        saldo = saldo + valor;
    }
    
    public static void main(String[] args) {
        conta c1 = new conta();
        
        c1.saldo = 100;
        c1.saldo = 200;
        c1.saldo = 300;
        c1.saldo = 400;
        c1.creditar(500);      
                
    }
    
}
