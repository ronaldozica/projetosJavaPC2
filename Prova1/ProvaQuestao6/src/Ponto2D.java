
/*
    Questão 6 Prova Teórico PC2
    Alunos:
        Henrique Coelho Mendes
        Nasser Rafael França Kilesse
        Ronaldo Mendonça Zica
 */

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto2D(Ponto2D pontoAux)
    {
        this.x = pontoAux.getX();
        this.y = pontoAux.getY();
    }
    
    public Ponto2D()
    {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double calculaDistancia(Ponto2D pontoAux)
    {
        double distancia, aux1, aux2;
        
        aux1 = pontoAux.getX() - this.getX();
        aux2 = pontoAux.getY() - this.getY();
        
        aux1 = Math.pow(aux1, 2);
        aux2 = Math.pow(aux2, 2);
        
        distancia = Math.sqrt(aux1 + aux2);
        
        return distancia;
    }
}
