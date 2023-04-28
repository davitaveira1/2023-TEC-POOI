/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula08;

/**
 *
 * @author Davi
 */
public class Ventilador {

    int velocidade;

    void ventiladorLigado() {
        System.out.println("Ventilador Ligado!");
    }

    void ventiladorDesligado() {
        System.out.println("Ventilador Desligado!");
    }

    void apresentarVelocidade() {
        System.out.println("Velocidade: " + velocidade);
    }

    public static void main(String[] args) {
        Ventilador ventiladorDoDavi;
        ventiladorDoDavi = new Ventilador();
        
        ventiladorDoDavi.velocidade=1;
        ventiladorDoDavi.ventiladorLigado();
        ventiladorDoDavi.ventiladorDesligado();
        ventiladorDoDavi.apresentarVelocidade();
    }

}
