/*
 faça um programa que calcule o fatorial do numero escolhido pelo o usuário
Ex. 5! = 120 (5 x 4 x 3 x 2 x 1 )
 */


//Método para obter entrada pelo o teclado
import java.util.Scanner;

public class ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFat;
        
        //Variavel que defini o valor que i vai assumir, que no caso sempre
        // será o numero que no numfat
        int multiplicacao = 1;

        System.out.println("Digite o numero para aparecer seu fatorial: ");
        numFat = sc.nextInt();
        
        // para (começa com o valor; termina com o valor; sequencia de passos para chegar no valor que termina)
        //para (começa com o valor i = variavel numFat; enquanto i(numFat) for maior/igual 1; vai subtraindo -1 de numFat)
        for(int i = numFat ; i >= 1 ; i-- ){
            //multiplicação = multiplicacao(1) * i(numFat), isso vai se repetir para todos os numeros numFat
            multiplicacao = multiplicacao * i;

        }

        System.out.println(numFat + "! = " + multiplicacao);
    }
    
}
