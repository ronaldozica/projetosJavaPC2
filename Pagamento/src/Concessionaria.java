
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Concessionaria extends Conta {

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }
    
    @Override
    public double getValorAPagar(){
        
        return this.valor ;
    }
    
}
