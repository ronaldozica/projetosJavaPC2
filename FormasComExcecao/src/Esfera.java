
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Esfera extends FormaTridimensional {
    
    private double raio;

    public Esfera(double raio, int numLados, int numDimensoes) {
        super(numLados, numDimensoes);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double obterArea()
    {
        double area;
        
        area = 4 * Math.PI * this.getRaio() * this.getRaio();
        
        return area;
    }
    
    public double obterVolume()
    {
        double volume;
        
        volume = 4/3 * Math.PI * this.getRaio() * this.getRaio() * this.getRaio();
        
        return volume;
    }
    
}
