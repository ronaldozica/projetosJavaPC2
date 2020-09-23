
import java.util.Scanner;


/*
    Questão 5 Prova Teórico PC2
    Alunos:
        Henrique Coelho Mendes
        Nasser Rafael França Kilesse
        Ronaldo Mendonça Zica
 */

public class Teste {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double aux1, aux2;
        
        Ponto2D primeiroPonto = new Ponto2D(1, 2);                              // constutor com o ponto (1,2)
        Ponto2D pontoOrigem = new Ponto2D();                                    // constutor com o ponto (0,0)
        Ponto2D pontoParametro = new Ponto2D(primeiroPonto);                    // construtor que recebe outro ponto como paramêtro
        
        System.out.println("Digite o primeiro ponto:");
        aux1 = scanner.nextDouble();
        aux2 = scanner.nextDouble();
        Ponto2D ponto1 = new Ponto2D(aux1, aux2);
        
        System.out.println("Digite o segundo ponto:");
        aux1 = scanner.nextDouble();
        aux2 = scanner.nextDouble();
        Ponto2D ponto2 = new Ponto2D(aux1, aux2);
        
        System.out.println("A distancia entre os dois pontos é: " + ponto1.calculaDistancia(ponto2));   
    }
    
}
