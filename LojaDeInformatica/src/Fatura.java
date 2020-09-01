
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Fatura {
    private ArrayList <Item> itens;
    private double valorFinal;

    public Fatura(ArrayList itens, double valorFinal) {
        this.itens = new ArrayList<> ();
        this.valorFinal = valorFinal;
    }

    public ArrayList getItens() {
        return itens;
    }

    public void setItens(ArrayList itens) {
        this.itens = itens;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    public double calcularFatura()
    {
        double somaFatura = 0;
        Iterator <Item> iterador = itens.iterator();
        
        while(iterador.hasNext())
        {
            somaFatura += iterador.next().calculaValorTotal();
        }
        
        return somaFatura;
    }
    
    public void exibirFatura()
    {
        System.out.println("Preço total a ser pago: " + this.calcularFatura());
    }

    public void exibirItens()
    {
        Item itemAux;
        Iterator <Item> iterador2 = itens.iterator();
        
        System.out.println("Lista de compras:");
        
        while(iterador2.hasNext())
        {
            itemAux = iterador2.next();
            System.out.println("Produto: " + itemAux.getProduto().getDescricao());
            System.out.println("Quantidade: " + itemAux.getQuantidade());
        }
        
        System.out.println("Fim da lista.");
    }
}
