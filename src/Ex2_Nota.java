//Faça um programa que peça uma nota entre 0 e 10, caso seja diferente do pedido
//mostre uma mensagem e continue pedindo a nota até que seja igual ao pedido.

import java.util.Scanner;

public class Ex2_Nota {

    

    public static void main(String[] args) {
        //Definindo a estrutura que aceitará a entrada pelo o teclado
        Scanner scan = new Scanner(System.in);

        int nota;
       
        //usando estrutura de repetição, para definir que enquanto for verdade 
        //irá ter que digitar uma nota
        while (true) {
            System.out.println("Digite uma nota: ");
            nota = scan.nextInt();
            
            //Após entrar no while, irá checar se a entra corresponde a esse Se,
            //se for verdade encerra o programa (break), senão for exibe o else
            if(nota > 0 && nota < 10){
                System.out.println("Nota aceita!");
            break; 
        }
        else{
            System.out.println("Nota inválida, tente novamente");
        }
       }
    
        
    
}

}