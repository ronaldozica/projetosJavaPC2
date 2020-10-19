
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Tetraedro extends FormaTridimensional {
    
    private double aresta;

    public Tetraedro(double aresta, int numLados, int numDimensoes) {
        super(numLados, numDimensoes);
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    public double obterArea()
    {
        double area;
        
        area = this.getAresta() * this.getAresta() * Math.sqrt(3);
        
        return area;
    }
    
    public double obterVolume()
    {
        double volume;
        
        volume = this.getAresta() * this.getAresta() * this.getAresta() * Math.sqrt(2)/12;
        
        return volume;
    }
    
}
