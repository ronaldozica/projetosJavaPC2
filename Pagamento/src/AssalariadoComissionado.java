
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class AssalariadoComissionado extends Comissionado {

    public AssalariadoComissionado(int vendasRealizadas, String nome, String sobrenome, int numIdent) {
        super(vendasRealizadas, nome, sobrenome, numIdent);
    }
    
    @Override
    public double getValorAPagar(){
       
        return (ControlePagamento.SALARIO + (this.getVendasRealizadas() * 10)); // considerando 6% da venda = R$ 10,00
    }
    
}
    
    
