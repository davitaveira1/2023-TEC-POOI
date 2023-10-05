/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12_prova;

/**
 *
 * @author Davi
 */
public class calculadora {
    
    double resultado;
    
    void op1(double n1, double n2){
        resultado = ((n1 + n2)/n1 - n2 * n2 - n1 )/2;
    }    

    public static void main(String[] args) {
        calculadora c = new calculadora();
        
        c.op1(50, 10);        
        
    }        
    
}
