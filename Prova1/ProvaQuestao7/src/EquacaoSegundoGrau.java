
/*
    Questão 7 Prova Teórico PC2
    Alunos:
        Henrique Coelho Mendes
        Nasser Rafael França Kilesse
        Ronaldo Mendonça Zica
 */

public class EquacaoSegundoGrau {

    public EquacaoSegundoGrau()
    {
    }
    
    public double[] calculaRaizes(double a, double b, double c)
    {
        double raizes[] = new double[3];
        double delta, aux, raizdelta;
        
        aux = Math.pow(b, 2);
        delta = aux - 4 * a * c;
        raizdelta = Math.sqrt(delta);
        
        if(delta == 0)
        {
            raizes[0] = -b / (2*a);
            raizes[1] = raizes[0];
            raizes[2] = 1;
        }
        
        else if(delta > 0)
        {
            raizes[0] = (-b + raizdelta) / (2*a);
            raizes[1] = (-b - raizdelta) / (2*a);
            raizes[2] = 2;
        }
        
        else
        {
            raizes[0] = 0;
            raizes[1] = 0;
            raizes[2] = 0;
        }
        
        return raizes;
    }
}
