/*
 Desenvolva um gerador de tabuada, capaz de gerar a 
 tabuada de qualquer número inteiro de 0 a 10.
 O usuário deverá informar de qual número ele deseja
 ver a tabuada.
 A saída de verá ser como exemplo abaixo.

 Tabuado de 5
 5 x 1 = 5
 5 x 2 = 10
 5 x 3 = 15
 ...
 5 x 10 = 50
 */



import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número entre 1 e 10 para tabuada aparecer: ");
        num = sc.nextInt();

        
        System.out.println("Tabuada de " + num);
        // Para N: começa com o valor 1; continua enquanto n for menor ou igual a 0, quantidade de passos é de 1 em 1
        for(int n = 1 ; n <= 10 ; n++ ){
            System.out.println(num + " X " + n + " = " + (num * n));

            
        }
    
    }
}
