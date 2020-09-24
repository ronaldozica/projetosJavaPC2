
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Compromisso {
    private int duracao;
    private String descricao;

    public Compromisso(int duracao, String descricao) {
        this.duracao = duracao;
        this.descricao = descricao;
    }
    
    public Compromisso()
    {
        this.descricao = " ";
        this.duracao = 0;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
