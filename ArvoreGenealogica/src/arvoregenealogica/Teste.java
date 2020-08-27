/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoregenealogica;

/**
 *
 * @author rzica
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pedro = new Pessoa("Pedro");
        Pessoa ronivalda = new Pessoa ("Ronivalda");
        Pessoa joaquim = new Pessoa ("Joaquim");
        Pessoa joaquina = new Pessoa ("Joaquina");
        Pessoa jose = new Pessoa("José", pedro, ronivalda);
        Pessoa maria = new Pessoa("Maria", joaquim, joaquina);
        Pessoa josefino = new Pessoa("Josefino", jose, maria);
        Pessoa mariana = new Pessoa("Mariana", jose, maria);
        
        if(jose.ehSemanticamenteIgual(josefino))
        {
            System.out.println("José e Josefino são a mesma pessoa");
        }
        
        else
        {
            System.out.println("José e Josefino não são a mesma pessoa");
        }
        
        if(jose.ehAntecessor(josefino))
        {
            System.out.println("José é antecessor de Josefino");
        }
        
        if(mariana.ehIrma(josefino))
        {
            System.out.println("Maria é irmã de Josefino");
        }
    }
    
}
