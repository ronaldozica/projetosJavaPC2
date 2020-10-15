
import java.util.Calendar;
import java.util.Random;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Titulo extends Conta {
    
    private Calendar dataVencimento;
    private Calendar dataPagamento;

    public Titulo(Calendar dataPagamento, int dia, int mes, double valor) {
        super(dia, mes, valor);
        this.dataPagamento = dataPagamento;
        dataVencimento = Calendar.getInstance();
        this.dataVencimento.set(Calendar.YEAR,2020);
        this.dataVencimento.set(Calendar.MONTH,mes);
        this.dataVencimento.set(Calendar.DAY_OF_MONTH,dia);
       
    }
    
    public Titulo(){
        
        this.dataVencimento.set(2020,this.mes, this.dia);
    }
    
    private boolean estaVencido(){
        
        if(this.dataPagamento.before(this.dataVencimento)){  
            return false;   
        }
        else return this.dataPagamento.after(this.dataVencimento);    
    }
    
    @Override
    public double getValorAPagar(){
        
        Random random = new Random();
        
        if(estaVencido() == true){
          
            return (1.1 * (this.valor));
        }
         
        return (this.valor);
    }
    
    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Calendar getDataEmissao() {
        return dataPagamento;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataPagamento = dataEmissao;
    }
    
}
