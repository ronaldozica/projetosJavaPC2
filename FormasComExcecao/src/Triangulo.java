
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Triangulo extends FormaBidimensional {

    private double base;
    private double altura;

    public Triangulo(double base, double altura, int numLados, int numDimensoes) {
        super(numLados, numDimensoes);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double obterArea()
    {
        double area;
        
        area = ( this.getBase() * this.getAltura() ) / 2;
        
        return area;
    }
    
    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException();
    }
}

