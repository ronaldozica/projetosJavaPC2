

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Comissionado extends Empregado {

    private int vendasRealizadas;

    public Comissionado(int vendasRealizadas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.vendasRealizadas = vendasRealizadas;
    }

    public Comissionado(int vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }
    
    public int getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(int vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }

    @Override
    public double getValorAPagar() {
    
        return (this.vendasRealizadas * 10);                                    // considerando 6% da venda = R$ 10,00
    }
    
}
