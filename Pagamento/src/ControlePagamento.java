
import java.util.ArrayList;


/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class ControlePagamento {
    
    public static double SALARIO = 954.00;
    public static double HORA = 8.00;
    
    private ArrayList<Pagavel> funcionariosPagaveis;
    
    public ControlePagamento() {
        this.funcionariosPagaveis = new ArrayList<>();
    }
    
    public void adicionaFuncionariosPagaveis(Pagavel funcionarioPagavel){  
        
        funcionariosPagaveis.add(funcionarioPagavel);      
    }

    public static double getSALARIO() {
        return SALARIO;
    }

    public static void setSALARIO(double SALARIO) {
        ControlePagamento.SALARIO = SALARIO;
    }

    public static double getHORA() {
        return HORA;
    }

    public static void setHORA(double HORA) {
        ControlePagamento.HORA = HORA;
    }

    public ArrayList<Pagavel> getPagaveis() {
        return funcionariosPagaveis;
    }

    public void setPagaveis(ArrayList<Pagavel> funcionariosPagaveis) {
        this.funcionariosPagaveis = funcionariosPagaveis;
    }
     
}