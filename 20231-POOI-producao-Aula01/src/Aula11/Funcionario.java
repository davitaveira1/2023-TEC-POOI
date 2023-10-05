/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11;

/**
 *
 * @author Davi
 */
public class Funcionario {
    
    String nome;
    String sobrenome;
    double salario;
    
    void apresentarNomeCompleto(){
        System.out.println("Nome completo: "+nome+" "+sobrenome);
    }
    
    void apresentarSalario(){
        System.out.println("Salario: "+salario);
    }
    
    void incrementarSalario(double valorAdicional){
        double salariofinal = salario + valorAdicional;
        System.out.println("Salario final: "+salariofinal);        
    }
    
    public static void main(String[] args) {
        Funcionario f1;
        f1 = new Funcionario();
        
        f1.nome = "davi";
        f1.sobrenome = "taveira";
        f1.salario = 1000;
        
        f1.apresentarNomeCompleto();
        f1.apresentarSalario();
        f1.incrementarSalario(2000);
                
        
    }
    

    
}
