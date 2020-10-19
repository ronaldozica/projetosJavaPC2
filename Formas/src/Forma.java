
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public abstract class Forma {
    protected int numLados;
    protected int numDimensoes;

    public Forma(int numLados, int numDimensoes) {
        this.numLados = numLados;
        this.numDimensoes = numDimensoes;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public int getNumDimensoes() {
        return numDimensoes;
    }

    public void setNumDimensoes(int numDimensoes) {
        this.numDimensoes = numDimensoes;
    }
}
