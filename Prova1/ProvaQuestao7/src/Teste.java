
import java.util.Scanner;

/*
    Questão 7 Prova Teórico PC2
    Alunos:
        Henrique Coelho Mendes
        Nasser Rafael França Kilesse
        Ronaldo Mendonça Zica
 */

public class Teste {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        double [] raizes = new double[2];
        
        System.out.println("Digite a:");
        a = scanner.nextDouble();
        
        System.out.println("Digite b:");
        b = scanner.nextDouble();
        
        System.out.println("Digite c:");
        c = scanner.nextDouble();
        
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
        raizes = equacao.calculaRaizes(a, b, c);
        
        if(raizes[2] == 0)
        {
            System.out.println("A equação não possui raízes.");
        }
        
        else if(raizes[2] == 1)
        {
            System.out.println("A equação só possui uma raiz: " + raizes[0]);
        }
        
        else
        {
            System.out.println("As raízes da equação são: " + raizes[0] + " e " + raizes[1]);
        }
    }
}
