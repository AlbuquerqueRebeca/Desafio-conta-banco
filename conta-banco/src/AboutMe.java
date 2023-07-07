import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
       
   //exceções na pratica 
    
       public static void main(String[] args) {
            
        try{   //se tudo estiver certo, ele nao vai disparar 

         Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
       String nome = entrada.next();

       System.out.print("Digite seu sobrenome: ");
       String sobrenome = entrada.next();

       System.out.print("Digite sua idade: ");
       int idade = entrada.nextInt();

       System.out.print("Digite sua altura: ");
       double altura = entrada.nextDouble();
            

        
        
        

       //imprimindo os dados 

       System.out.println("Olá me chamo " + nome.toUpperCase() + " ");
       System.out.println("Tenho " + idade + " anos ");
       System.out.println("Minha altura é " + altura + " cm ");  










        }
        catch(InputMismatchException e ){ //o possivel erro que será corrigidore
            System.out.println("os campos idade e altura precisam ser numéricos"); //alerta para o usuario
        }
        
         
       
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
       


       }
}
