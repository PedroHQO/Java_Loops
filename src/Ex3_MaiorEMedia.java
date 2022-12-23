/*
Faça um programa que leia 5 numeros
mostre o maior entre eles
e a média 
*/

import java.util.Scanner;


public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        //Definindo uma variavél contador
        int count = 0;
        //É preciso definir qual será o valor incial 
        int maior = 0;
        
        int soma = 0;

        //Instrução a ser executada antes de entrar em WHILE
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            //Com o passar do codigo o contador soma UM de acordo com 
            //numero de vezes pedido
            count++;

            soma = soma + numero;

            if(numero > maior)maior = numero;

            
        //Enquanto contador não chegar a 5, não para de pedir numero
        }while(count < 5);


        System.out.println("O maior numero foi: " + maior);

        System.out.println("A soma dos numero são: " + soma);

        System.out.println("A média dos numero são: " + soma/5);
    }
    
}