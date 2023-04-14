/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author Davi
 */
public class Carro {

    String modelo;
    double preco;
    int ano;

    public static void main(String[] args) {
        //criando o objeto
        Carro carroDoDavi;
        //instanciando o objeto
        carroDoDavi = new Carro();

        carroDoDavi.modelo = "Gol";
        carroDoDavi.ano = 1990;
        carroDoDavi.preco = 5000;

        System.out.println("Modelo: "+carroDoDavi.modelo);
    }

}
