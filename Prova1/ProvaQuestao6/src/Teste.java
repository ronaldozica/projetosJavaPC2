
import java.util.Scanner;

/*
    Questão 6 Prova Teórico PC2
    Alunos:
        Henrique Coelho Mendes
        Nasser Rafael França Kilesse
        Ronaldo Mendonça Zica
 */


// EXEMPLOS DE TRIÂNGULOS
// Pontos para um triângulo isósceles: (-2,3); (3,2); (-1,-2);
// Pontos para um triângulo equilátero: (0,0); (4,0); (2,2sqrt3);
// Pontos para um triângulo escaleno: (-3,1); (-2,5); (3,4);

public class Teste {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double aux1, aux2;
        
        System.out.println("A partir de agora digite os pontos dos triângulos, acima do \"public class Teste\" no código há exemplos de triângulos isósceles, equilátero e escaleno.");
        
        System.out.println("Digite o primeiro ponto do triângulo:");
        aux1 = scanner.nextDouble();
        aux2 = scanner.nextDouble();
        Ponto2D ponto1 = new Ponto2D(aux1, aux2);
        
        System.out.println("Digite o segundo ponto do triângulo:");
        aux1 = scanner.nextDouble();
        aux2 = scanner.nextDouble();
        Ponto2D ponto2 = new Ponto2D(aux1, aux2);
        
        System.out.println("Digite o terceiro ponto do triângulo:");
        aux1 = scanner.nextDouble();
        aux2 = scanner.nextDouble();
        Ponto2D ponto3 = new Ponto2D(aux1, aux2);
        
        Triangulo trianguloAux = new Triangulo (ponto1, ponto2, ponto3);
        
        if(trianguloAux.equilatero())
        {
            System.out.println("Esse triângulo é equilátero.");
            System.out.println("Seu perímetro é: " + trianguloAux.perimetro());
            System.out.println("Sua área é: " + trianguloAux.area());
        }
        
        else if(trianguloAux.escaleno())
        {
            System.out.println("Esse triângulo é escaleno.");
            System.out.println("Seu perímetro é: " + trianguloAux.perimetro());
            System.out.println("Sua área é: " + trianguloAux.area());
        }
        
        else if(trianguloAux.isosceles())
        {
            System.out.println("Esse triangulo é isosceles.");
            System.out.println("Seu perímetro é: " + trianguloAux.perimetro());
            System.out.println("Sua área é: " + trianguloAux.area());
        }
        
        else
        {
            System.out.println("Os pontos digitados não formam um triângulo.");
        }
    }
    
}
