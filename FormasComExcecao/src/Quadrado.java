
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Quadrado extends FormaBidimensional {

    private double tamanhoLado;

    public Quadrado(double tamanhoLado, int numLados, int numDimensoes) {
        super(numLados, numDimensoes);
        this.tamanhoLado = tamanhoLado;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    
    public double obterArea()
    {
        double area;
        
        area = this.getTamanhoLado() * this.getTamanhoLado();
        
        return area;
    }
    
    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException();
    }
}
