
import java.util.Scanner;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class CallCenter {
    public static void main(String[] args) {
        
        String problemaAux = " ";
        Scanner input = new Scanner(System.in);
        Interpretadora  interpretador = new Interpretadora();
       
        System.out.println("Olá, bem vindo ao Sistema de suporte técnico!");
        
       while(problemaAux.toLowerCase().equals("sair") == false)
       {
            System.out.println("Por favor, descreva seu problema de maneira sucinta ou digite 'sair' para sair do aplicativo: ");
            problemaAux = input.nextLine();
            
            if(problemaAux.toLowerCase().equals("sair"))
            {
                break;
            }
            
            String solucaoProblema = interpretador.retornaSolucao(problemaAux);
            System.out.println(solucaoProblema);
            
            System.out.println("\n*----------------------------------------------------------------------------------------*\n");
        }
        
        System.out.println("Foi um prazer receber você nesse Sistema, espero ter resolvido seu problema.");
    }
}
