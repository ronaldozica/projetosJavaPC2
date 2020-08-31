
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

package arvoregenealogica;

public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;                                                       // Construtor com nome, pai e mãe, usado para o vetor pessoa[]
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this.nome = nome;                                                       // Contrutor apenas com nome, usado pelos vetores mae[] e pai[]
    }
    
    public boolean ehSemanticamenteIgual(Pessoa pessoa){
        return ( ( pessoa.getNome().equals(this.getNome()) ) && pessoa.getMae().getNome().equals(this.getMae().getNome()) );
    }                                                                           // Se possui o mesmo nome e mãe com o mesmo nome, então são iguais
    
    public boolean ehIrma(Pessoa pessoa){
        return ( (this.getMae().getNome().equals(pessoa.getMae().getNome())) || (this.getPai().getNome().equals(pessoa.getPai().getNome())) );
    }                                                                           // Se possui o mesmo nome de pai ou de mãe, então são irmãos
    
    public boolean ehAntecessor(Pessoa pessoa){
        
        if (this.getNome().equals(pessoa.getPai().getNome()))
        {
            return true;
        }                                                                       // Se essa pessoa é pai ou mãe da pessoa que foi passada como
                                                                                // parâmetro, então é antecessor
        return ( this.getNome().equals(pessoa.getMae().getNome()) );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    
    
}


