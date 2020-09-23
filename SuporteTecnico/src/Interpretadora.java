
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Interpretadora {
    private HashSet<String> palavraChave;
    private SuporteTecnico solucao; 
    
    public Interpretadora(){
        this.palavraChave = new HashSet<>();
        this.solucao = new SuporteTecnico();
    }

    public HashSet<String> getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(HashSet<String> palavraChave) {
        this.palavraChave = palavraChave;
    }

    public SuporteTecnico getSolucao() {
        return solucao;
    }

    public void setSolucao(SuporteTecnico solucao) {
        this.solucao = solucao;
    }
    
    public HashSet<String> separaPalavraChave(String problema){
        
        StringTokenizer separaProblema = new StringTokenizer(problema);
        this.palavraChave = new HashSet <String>();
        
        while(separaProblema.hasMoreTokens()){
            
            this.getPalavraChave().add(separaProblema.nextToken());
            return this.getPalavraChave();
        }
        
        return this.getPalavraChave();
    }
    
    public String retornaSolucao(String problema){
        
        this.setPalavraChave(separaPalavraChave(problema));
        
        for(String descricao: this.getPalavraChave()){
            
           if(descricao != null){
               
               String aux = this.getSolucao().buscaSolucao(descricao);
               
               if(aux != null){  
                   return aux;
               }  
           }  
        }
        
        String aux = this.getSolucao().buscaSolucaoPadrao();
        return aux;
    }
}
