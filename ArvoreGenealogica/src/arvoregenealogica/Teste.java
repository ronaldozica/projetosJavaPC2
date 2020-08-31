/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arvoregenealogica;
import java.util.Scanner;

/**
 *
 * @author rzica
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pessoa[] pessoa = new Pessoa [10];
        Pessoa[] mae = new Pessoa [10];
        Pessoa[] pai = new Pessoa [10];
        
        String nome = " ";
        String nomeMae = " ";
        String nomePai = " ";
        
        for(int i = 1; i < 11; i ++)
        {
                System.out.println("Digite o nome da " + i + "ª pessoa:");
                nome = scanner.next();
                
                System.out.println("Digite o nome da mãe da " + i  + "ª pessoa:");
                nomeMae = scanner.next();
                
                System.out.println("Digite o nome do pai da " + i + "ª pessoa:");
                nomePai = scanner.next();
                
                mae[i - 1] = new Pessoa(nomeMae);
                pai[i - 1] = new Pessoa(nomePai);
                
                pessoa[i - 1] = new Pessoa(nome, mae[i - 1], pai[i - 1]);
        }
    
        if(pessoa[0].ehSemanticamenteIgual(pessoa[1]))
        {
            System.out.println(pessoa[0].getNome() + " e " + pessoa[1].getNome() + " são a mesma pessoa");
        }
        
        else
        {
            System.out.println(pessoa[0].getNome() + " e " + pessoa[1].getNome() + " não são a mesma pessoa");
        }
        
        if(pessoa[0].ehAntecessor(pessoa[1]))
        {
            System.out.println(pessoa[0].getNome() + " é antecessor de " + pessoa[1].getNome());
        }
        
        else
        {
            System.out.println(pessoa[0].getNome() + " não é antecessor de " + pessoa[1].getNome());
        }
        
        if(pessoa[0].ehIrma(pessoa[1]))
        {
            System.out.println(pessoa[0].getNome() + " é irmã(o) de " + pessoa[1].getNome());
        }
        
        else
        {
            System.out.println(pessoa[0].getNome() + " não é irmã(o) de " + pessoa[1].getNome());
        }
    }
    
}
