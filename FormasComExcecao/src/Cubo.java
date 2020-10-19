
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Cubo extends FormaTridimensional {
    
    private double tamanhoAresta;

    public Cubo(double tamanhoAresta, int numLados, int numDimensoes) {
        super(numLados, numDimensoes);
        this.tamanhoAresta = tamanhoAresta;
    }

    public double getTamanhoAresta() {
        return tamanhoAresta;
    }

    public void setTamanhoAresta(double tamanhoAresta) {
        this.tamanhoAresta = tamanhoAresta;
    }
    
    public double obterArea()
    {
        double area;
        
        area = this.getTamanhoAresta() * this.getTamanhoAresta();
        
        return area;
    }
    
    public double obterVolume()
    {
        double volume;
        
        volume = this.getTamanhoAresta() * this.getTamanhoAresta() * this.getTamanhoAresta();
        
        return volume;
    }
    
}
