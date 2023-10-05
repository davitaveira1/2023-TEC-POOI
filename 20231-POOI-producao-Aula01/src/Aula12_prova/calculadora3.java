/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12_prova;

/**
 *
 * @author Davi
 */
public class calculadora3 {
    
    double resultado;
    double x,y,z;
    
    void op1(){
        resultado = z / x + y ;
        System.out.println(resultado);
    }
    
    public static void main(String[] args) {
        calculadora3 c = new calculadora3();
        
        c.x = 1000;
        c.y = 2000;
        c.z = 3000;
        
        c.op1();
        
    }       
    
}
