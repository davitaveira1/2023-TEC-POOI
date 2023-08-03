/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula10;

/**
 *
 * @author Davi
 */
public class Filme {
    
    String nomeFilme;
    String categoriaFilme;
    int duracaoEmMinutos;
    
    void apresentarNomeFilme(){
        System.out.println("Nome do filme: "+nomeFilme);
    }
    
    void apresentarCategoriaFilme(){
        System.out.println("Categoria do filme: "+categoriaFilme);
    }
    
    void apresentarDuracaoFilme(){
        System.out.println("Duração do filme: "+duracaoEmMinutos);
    }
    
    public static void main(String[] args) {
        //criar um objeto
        Filme filme1;
        filme1 = new Filme();
        
        filme1.nomeFilme = "Barbie";
        filme1.categoriaFilme = "Infantil";
        filme1.duracaoEmMinutos = 240;
        
        filme1.apresentarNomeFilme();
        filme1.apresentarCategoriaFilme();
        filme1.apresentarDuracaoFilme();
    }
    
}
