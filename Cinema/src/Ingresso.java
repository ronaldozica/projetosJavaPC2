
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }
    
    public Ingresso()
    {
        this.valor = 0.0;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
