
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Dia {
    private Compromisso compromissos[];
    private String diaDaSemana;
    
    public Dia() {
        this.compromissos = new Compromisso[10];
        
        this.compromissos[0] = new Compromisso();
        this.compromissos[1] = new Compromisso();
        this.compromissos[2] = new Compromisso();
        this.compromissos[3] = new Compromisso();
        this.compromissos[4] = new Compromisso();
        this.compromissos[5] = new Compromisso();
        this.compromissos[6] = new Compromisso();
        this.compromissos[7] = new Compromisso();
        this.compromissos[8] = new Compromisso();
        this.compromissos[9] = new Compromisso();
        
        this.diaDaSemana = " ";
    }

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(Compromisso[] compromissos) {
        this.compromissos = compromissos;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
    
    public boolean adicionarCompromissos(Compromisso compromissoInformado, int horarioInformado)
    {
        int duracao;
        
        if( (horarioInformado >= 9) && (horarioInformado <= 18) )
        {
            duracao = compromissoInformado.getDuracao();
            
            if( (duracao <= 0) || (duracao > 10) )
            {
                System.out.println("A duração do compromisso deve ser no mínimo 1h e no máximo 10h.");
                return false;
            }
            
            horarioInformado -= 9;
            
            if( duracao + horarioInformado > 19)
            {
                System.out.println("Duracão excede o horário válido.");
                return false;
            }
            
            for(int i = horarioInformado; duracao > 0; duracao --)
            {
                this.compromissos[i] = compromissoInformado;
                i ++;
            }
            
            return true;
        }
        
        else
        {
            System.out.println("Horário inválido.");
            return false;
        }
    }
    
    public void exibirCompromissos()
    {
        int j;
        
        for(int i = 9; i <= 18; i ++)
        {
            j = i -9;
            
            if(this.getCompromissos()[j].getDescricao() != null)
            {
                System.out.println(i + ":00h - " + this.getCompromissos()[j].getDescricao());
            }
            
            else
            {
                System.out.println(i + ":00h - horário livre.");
            }
        }
    }
}
