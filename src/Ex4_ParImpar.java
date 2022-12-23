/*
 Faça um programa que peça N numeros inteiros
 calcule e mostre a quantidade numeros pares e
 a quantidade de numeros impares
 */


import java.util.Scanner;

public class Ex4_ParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variavel que define a quantidade numero escolhida pelo o usuario
        int quantNumero;

        int num;
        //variavel que fará a soma dos pares e impares
        int numPares = 0, numImpares = 0;
        //Variavel que faz o controle das vezes escolhidas pelo o usario no while
        int cont = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumero = sc.nextInt();
        
        do{
            System.out.println("Digite numero: ");
            num = sc.nextInt();
            //se resto da divisao de num por 2 for == a 0, é par!
            //armazena na variavél numPares
            if (num % 2 == 0) numPares++;
            //Senão será impar, armazena na variável ímpar
            else numImpares++;  
            //essa variavél cont faz o controle da quant escolhida
            cont++;

        }while(cont < quantNumero);

        System.out.println("----------------------------");
        System.out.println("Total Pares: " + numPares);
        System.out.println("Total Impares: " + numImpares);

        if(numPares > numImpares){
            System.out.println("Você digitou mais numeros PARES!");
        }else if(numPares == numImpares){
            System.out.println("Você digitou a mesma quantidade de PARES e ÍMPARES!");
            
        }else{
            System.out.println("Você digitou mais numeros ÍMPARES!");
        }

    }
    
}
