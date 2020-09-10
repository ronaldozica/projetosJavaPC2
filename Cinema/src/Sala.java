
import java.util.HashMap;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Sala {
    private int numero;
    private int capacidade;
    private HashMap <Integer,Ingresso> assentos;

    public Sala(int numero, int capacidade, HashMap<Integer, Ingresso> assentos) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.assentos = assentos;
    }
    
    public Sala()
    {
        this.numero = 0;
        this.capacidade = 0;
        this.assentos = null;
    }
    
    public Sala(int numero)
    {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public HashMap<Integer, Ingresso> getAssentos() {
        return assentos;
    }

    public void setAssentos(HashMap<Integer, Ingresso> assentos) {
        this.assentos = assentos;
    }
}
