
import java.util.ArrayList;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Teste {
    public static void main(String[] args) {
        
        Forma quadrado1 = new Quadrado(4,4,2);                                  // Quadrado(double tamanhoLado, int numLados, int numDimensoes)
        Forma circulo1 = new Circulo(4,0,2);                                    // Circulo(double raio, int numLados, int numDimensoes)
        Forma triangulo1 = new Triangulo(2,4,3,2);                              // Triangulo(double base, double altura, int numLados, int numDimensoes)
        
        Forma cubo1 = new Cubo(4,4,3);                                          // Cubo(double tamanhoAresta, int numLados, int numDimensoes) 
        Forma esfera1 = new Esfera(2,0,3);                                      // Esfera(double raio, int numLados, int numDimensoes)
        Forma tetraedro1 = new Tetraedro(4,3,3);                                // Tetraedro(double aresta, int numLados, int numDimensoes)
        
        ArrayList <Forma> formas = new ArrayList <> ();
        
        formas.add(quadrado1);
        formas.add(circulo1);
        formas.add(triangulo1);
        
        formas.add(cubo1);
        formas.add(esfera1);
        formas.add(tetraedro1);
        
        TrataFormas auxFormas = new TrataFormas(formas);
        auxFormas.trataFormas();
        
        }
}
