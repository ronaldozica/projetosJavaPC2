
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Circulo extends FormaBidimensional {

    private double raio;

    public Circulo(double raio, int numLados, int numDimensoes) {
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
        
        area = Math.PI * this.getRaio() * this.getRaio();
        
        return area;
    }

    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException();
    }
}
