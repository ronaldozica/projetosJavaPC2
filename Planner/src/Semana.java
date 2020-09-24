
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Semana {
    private Dia dias[];

    public Semana() {
        this.dias = new Dia[5];
        
        this.dias[0] = new Dia();
        this.dias[1] = new Dia();
        this.dias[2] = new Dia();
        this.dias[3] = new Dia();
        this.dias[4] = new Dia();
        
        this.dias[0].setDiaDaSemana("Segunda-feira");
        this.dias[1].setDiaDaSemana("Terça-feira");
        this.dias[2].setDiaDaSemana("Quarta-feira");
        this.dias[3].setDiaDaSemana("Quinta-feira");
        this.dias[4].setDiaDaSemana("Sexta-feira");
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }
    
    public boolean adicionarCompromissoAoDia(int diaDaSemana, Compromisso compromissoInformado, int horarioInformado)
    {
        return (this.getDias()[diaDaSemana].adicionarCompromissos(compromissoInformado, horarioInformado));
    }
    
    public void exibeHorarioTodosOsDias()
    {
        for(int i = 0; i < 5; i ++)
        {
            System.out.println("*-------------------------------------------*");
            System.out.println("Horário de " + this.getDias()[i].getDiaDaSemana() + ":");
            this.getDias()[i].exibirCompromissos();
        }
        
        System.out.println("*-------------------------------------------*");
    }
    
}
