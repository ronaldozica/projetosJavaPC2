
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Item {
    private Produto produto;
    private int quantidade;
    
    public Item(Produto produto, int quantidade)
    {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Item() {
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
    public double calculaValorTotal()
    {
        double somaTotal = this.getQuantidade() * this.produto.getValor();
        
        return somaTotal;
    }
}
