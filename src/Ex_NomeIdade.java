//Faça um programa que peça o nome e a Idad repetida vezes
//O programa só se encerrará ao digitar "0", no nome

import java.util.Scanner;


public class Ex_NomeIdade {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        //Enquanto for verdade, vai pedir nome(String) e idade(int)
       while (true) {
        System.out.println("Nome: ");
        nome = scan.next();
        //Se colocar 0 no lugar de uma String vai para o programa
        if(nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = scan.nextInt();
       
    
    
        }

       System.out.println("Obrigado por contribuir comigo!");





    }

    
}