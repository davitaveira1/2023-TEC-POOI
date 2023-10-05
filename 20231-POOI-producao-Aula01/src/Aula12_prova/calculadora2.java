/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12_prova;


/**
 *
 * @author Davi
 */
public class calculadora2 {
    
    double resultado;
    
    void op1(double x, double y, double z){
        resultado = (x + y + z) - (x * 4 / x) / (x  / y - z) ;
        System.out.println(resultado);
    }
    
    public static void main(String[] args) {
        calculadora2 c = new calculadora2();
        
        c.op1(10, 15, 20);        
        
    }   
    
}
