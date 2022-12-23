//Faça um programa que peça o nome e a Idad repetida vezes
//O programa só se encerrará ao digitar "0", no nome

import java.util.Scanner;


public class Ex_NomeIdade {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

       while (true) {
        System.out.println("Nome: ");
        nome = scan.next();
        if(nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = scan.nextInt();
       
    
    
        }

       System.out.println("Obrigado por contribuir comigo!");





    }

    
}