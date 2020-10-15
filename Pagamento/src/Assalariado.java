
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Assalariado extends Empregado {
    
    private double horasTrabalhadasSemana;

    public Assalariado(double horasTrabalhadasSemana, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
    }

    public Assalariado() {
    }

    public double getHorasTrabalhadasSemana() {
        return horasTrabalhadasSemana;
    }

    public void setHorasTrabalhadasSemana(double horasTrabalhadasSemana) {
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
    }
    
    @Override
    public double getValorAPagar() 
    {
        if(this.horasTrabalhadasSemana>40){
            return(((this.horasTrabalhadasSemana-40) * ControlePagamento.HORA) + ControlePagamento.SALARIO);
        }
        
        return ControlePagamento.SALARIO;
    }
   
}
