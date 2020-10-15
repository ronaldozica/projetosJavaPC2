
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Terceirizado extends Empregado {
    
    private double horasTrabalhadas;

    public Terceirizado(double horasTrabalhadas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Terceirizado(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Terceirizado() {
    }
    
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double getValorAPagar() {
    
        return (this.horasTrabalhadas * ControlePagamento.HORA);
    }   
    
}