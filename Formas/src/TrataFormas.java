
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class TrataFormas {
    
    private ArrayList<Forma> formas;

    public TrataFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }
    
    public void trataFormas()
    {
        Iterator <Forma> it = this.getFormas().iterator();
        
        while(it.hasNext())
        {
            Forma formaAux = it.next();
            
            switch(formaAux.getNumLados())
            {
                case 0:
                    
                    if(formaAux.getNumDimensoes() == 2)
                    {
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("Círculo de raio " + ((Circulo)formaAux).getRaio() + ".");
                        System.out.println("Tipo da figura: Bidimensional.");
                        System.out.println("Sua área é: " + ((Circulo)formaAux).obterArea() + ".");
                    }
                    
                    else if(formaAux.getNumDimensoes() == 3)
                    {
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("Esfera de raio " + ((Esfera)formaAux).getRaio() + ".");
                        System.out.println("Tipo da figura: Tridimensional.");
                        System.out.println("Sua área é: " + ((Esfera)formaAux).obterArea() + ".");
                        System.out.println("Seu volume è: " + ((Esfera)formaAux).obterVolume() + ".");
                    }
                    
                    break;
                    
                case 3:
                    
                    if(formaAux.getNumDimensoes() == 2)
                    {
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("Triângulo equilátero de base " + ((Triangulo)formaAux).getBase() + " e altura " + ((Triangulo)formaAux).getAltura() + "." );
                        System.out.println("Tipo da figura: Bidimensional.");
                        System.out.println("Sua área é: " + ((Triangulo)formaAux).obterArea() + ".");
                    }
                    
                    else if(formaAux.getNumDimensoes() == 3)
                    {
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("Tetraedro de aresta " + ((Tetraedro)formaAux).getAresta() + ".");
                        System.out.println("Tipo da figura: Tridimensional.");
                        System.out.println("Sua área é: " + ((Tetraedro)formaAux).obterArea() + ".");
                        System.out.println("Seu volume è: " + ((Tetraedro)formaAux).obterVolume() + ".");
                    }
                    
                    break;
                    
                case 4:
                    
                    if(formaAux.getNumDimensoes() == 2)
                    {
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("Quadrado de aresta " + ((Quadrado)formaAux).getTamanhoLado() + ".");
                        System.out.println("Tipo da figura: Bidimensional.");
                        System.out.println("Sua área é: " + ((Quadrado)formaAux).obterArea() + ".");
                    }
                    
                    else if(formaAux.getNumDimensoes() == 3)
                    {
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("Quadrado de aresta " + ((Cubo)formaAux).getTamanhoAresta() + ".");
                        System.out.println("Tipo da figura: Tridimensional.");
                        System.out.println("Sua área é: " + ((Cubo)formaAux).obterArea() + ".");
                        System.out.println("Seu volume è: " + ((Cubo)formaAux).obterVolume() + ".");
                    }
                    
                    break;
                    
                default:
                    break;
            }
        }
        
        System.out.println("--------------------------------------------------------------------");
    }
}
