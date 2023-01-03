/*
 * Faça um programa que leia um nome de usuário 
 e a sua senha e não aceite a senha igual ao nome 
 do usuário, mostrando uma mensagem de erro e voltando 
 a pedir as informações.
 */
import java.util.Scanner;

public class UsuarioSenha {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   String usuario;
   String senha;

   System.out.println("Digite seu USUARIO: ");
   usuario = sc.next();

   System.out.println("Digite sua senha: ");
   senha = sc.next();

   while (usuario.equals(senha)) {

         System.out.println("Senha não pode ser igual ao nome de usuario!");
         System.out.println("TENTE NOVAMENTE!");

            System.out.println("Digite seu USUARIO: ");
            usuario = sc.next();

            System.out.println("Digite sua senha: ");
            senha = sc.next();

            if(usuario != senha){
               System.out.println("Conta criada com sucesso");
               break;
            }
      
      
   }


   



   } 
}
