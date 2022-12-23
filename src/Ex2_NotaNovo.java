
import java.util.Scanner;

public class Ex2_NotaNovo {
    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
        int nota;
      
      System.out.println("Digite uma nota válida: ");
      nota = scan.nextInt();

      while (nota < 0 || nota > 10) {
        System.out.println("Nota Inválida, Tente Novamente! ");
        nota = scan.nextInt();

      }
      System.out.println("Nota válida!");

    }
}
