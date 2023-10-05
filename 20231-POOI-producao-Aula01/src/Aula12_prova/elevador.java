/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12_prova;

/**
 *
 * @author Davi
 */
public class elevador {
    
    int andar=0;
    int numeroAndares=3;
    
    void subir(){
        if(andar>=numeroAndares){
            System.out.println("Não pode subir!");
        }else{
            andar=andar+1;
        } 
       
    }
    
    void descer(){
        if(numeroAndares<=0){
            System.out.println("Não pode descer!");
        }else{
            andar=andar-1;
        }        

    }
    
    public static void main(String[] args) {
        
        elevador e1 = new elevador();
        
        e1.subir();
        e1.subir();
        e1.subir();
        e1.descer();
        e1.descer();
        e1.subir();
        e1.descer();
        e1.descer();
        e1.subir();
        e1.descer();
        e1.subir();        
        e1.subir();
        e1.subir();
        e1.descer();
        e1.subir();
        e1.subir();        
        
    }
    
}
