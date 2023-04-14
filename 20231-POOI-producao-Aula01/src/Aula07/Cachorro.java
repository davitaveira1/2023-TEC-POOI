/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author Davi
 */
public class Cachorro {
    
    String nome;
    
    void fazerCachorroLatir(){
        System.out.println("Au!Au!Au!");
    }
    
    void apresentarNomeCachorro(){
        System.out.println(nome);
    }
    
    public static void main(String[] args) {
      Cachorro cachorroDoEduardo;
      cachorroDoEduardo = new Cachorro();
      
      cachorroDoEduardo.nome = "Mike";
      cachorroDoEduardo.fazerCachorroLatir();
      cachorroDoEduardo.apresentarNomeCachorro();
    }
}
