
import java.util.Calendar;
//import java.util.Random;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class SistemaPagamentoTeste {
    
    public static void main(String[] args) {
        
        double totalGastoPelaEmpresa, valorConcessionaria, valorTitulo;
        
        totalGastoPelaEmpresa = 0;
        valorConcessionaria = Math.random() * 1000;
        valorConcessionaria = Math.round(valorConcessionaria);
        valorTitulo = Math.random() * 1000;
        valorTitulo = Math.round(valorTitulo);
        
        ControlePagamento controleEmpresa = new ControlePagamento();
        
        Calendar dataPagamentoAux = Calendar.getInstance();
        dataPagamentoAux.set(Calendar.DAY_OF_MONTH,1);
        dataPagamentoAux.set(Calendar.MONTH,1);
        dataPagamentoAux.set(Calendar.YEAR,2020);
        
        Assalariado trabalhadorAssalariado = new Assalariado(40, "Ronaldo", "Zica", 4200);
        Terceirizado trabalhadorTerceirizado = new Terceirizado(25, "Zequinha", "Silva", 7560);
        Comissionado trabalhadorComissionado = new Comissionado(80, "Maria", "Joaquina", 1569);
        AssalariadoComissionado trabalhadorAssalariadoComissionado = new AssalariadoComissionado(120, "Vitor", "Pereira", 1472);
        
        Concessionaria contaConcessionaria = new Concessionaria(1, 1, valorConcessionaria);
        Titulo contasTitulo = new Titulo(dataPagamentoAux, 1, 1, valorTitulo);
        
        controleEmpresa.adicionaFuncionariosPagaveis(trabalhadorAssalariado);
        controleEmpresa.adicionaFuncionariosPagaveis(trabalhadorTerceirizado);
        controleEmpresa.adicionaFuncionariosPagaveis(trabalhadorComissionado);
        controleEmpresa.adicionaFuncionariosPagaveis(trabalhadorAssalariadoComissionado);
        
        controleEmpresa.adicionaFuncionariosPagaveis(contaConcessionaria);
        controleEmpresa.adicionaFuncionariosPagaveis(contasTitulo);
        
        System.out.println("-----------------------------------------");
        
        for (Pagavel funcionariosPagaveis : controleEmpresa.getPagaveis()) 
        {
            if(funcionariosPagaveis instanceof Terceirizado)
            {                
                System.out.println("Funcionários terceirizados:");
                System.out.println(((Terceirizado) funcionariosPagaveis).getNome() + " R$: " + funcionariosPagaveis.getValorAPagar());
                totalGastoPelaEmpresa += funcionariosPagaveis.getValorAPagar();
                System.out.println("-----------------------------------------");
            }
            
            if(funcionariosPagaveis instanceof Assalariado)
            {                
                System.out.println("Funcionários assalariados:");
                System.out.println(((Assalariado) funcionariosPagaveis).getNome() + " R$: " + funcionariosPagaveis.getValorAPagar());
                totalGastoPelaEmpresa += funcionariosPagaveis.getValorAPagar();
                System.out.println("-----------------------------------------");
            }
            
            if((funcionariosPagaveis instanceof Comissionado) && !(funcionariosPagaveis instanceof AssalariadoComissionado))
            {
                System.out.println("Funcionários comissionados:");
                System.out.println(((Comissionado) funcionariosPagaveis).getNome() + " R$: " + funcionariosPagaveis.getValorAPagar());
                totalGastoPelaEmpresa += funcionariosPagaveis.getValorAPagar(); 
                System.out.println("-----------------------------------------");
            }
            
            if(funcionariosPagaveis instanceof AssalariadoComissionado)
            {
                System.out.println("Funcionários assalariados comissionados:");
                System.out.println(((AssalariadoComissionado) funcionariosPagaveis).getNome() + " R$: " + funcionariosPagaveis.getValorAPagar());
                totalGastoPelaEmpresa += funcionariosPagaveis.getValorAPagar(); 
                System.out.println("-----------------------------------------");
            }
            
            if(funcionariosPagaveis instanceof Concessionaria)
            {    
                System.out.println("Concessionária:");
                System.out.println("R$: " + funcionariosPagaveis.getValorAPagar());
                totalGastoPelaEmpresa += funcionariosPagaveis.getValorAPagar(); 
                System.out.println("-----------------------------------------");
            }
            
            if(funcionariosPagaveis instanceof Titulo)
            {
                System.out.println("Título:");
                System.out.println("R$: " + funcionariosPagaveis.getValorAPagar());
                totalGastoPelaEmpresa += funcionariosPagaveis.getValorAPagar(); 
                System.out.println("-----------------------------------------");
            }
        }
        
        System.out.println("O gasto total da empresa foi: R$ " + totalGastoPelaEmpresa);
    }
    
}
