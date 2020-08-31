/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoregenealogica;

/**
 *
 * @author rzica
 */
public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public boolean ehSemanticamenteIgual(Pessoa pessoa){
        return ( ( pessoa.getNome().equals(this.getNome()) ) && pessoa.getMae().getNome().equals(this.getMae().getNome()) );
    }
    
    public boolean ehIrma(Pessoa pessoa){
        return ( (this.getMae().getNome().equals(pessoa.getMae().getNome())) || (this.getPai().getNome().equals(pessoa.getPai().getNome())) );
    }
    
    public boolean ehAntecessor(Pessoa pessoa){
        
        if (this.getNome().equals(pessoa.getPai().getNome()))
        {
            return true;
        }
        
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


