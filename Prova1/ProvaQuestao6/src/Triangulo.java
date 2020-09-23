
/*
    Questão 5 Prova Teórico PC2
    Alunos:
        Henrique Coelho Mendes
        Nasser Rafael França Kilesse
        Ronaldo Mendonça Zica
 */

public class Triangulo {
    private Ponto2D p1;
    private Ponto2D p2;
    private Ponto2D p3;

    public Triangulo(Ponto2D p1, Ponto2D p2, Ponto2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Ponto2D getP1() {
        return p1;
    }

    public void setP1(Ponto2D p1) {
        this.p1 = p1;
    }

    public Ponto2D getP2() {
        return p2;
    }

    public void setP2(Ponto2D p2) {
        this.p2 = p2;
    }

    public Ponto2D getP3() {
        return p3;
    }

    public void setP3(Ponto2D p3) {
        this.p3 = p3;
    }
    
    public static boolean formaTriangulo(Ponto2D p1, Ponto2D p2, Ponto2D p3)
    {
        double lado1 = Math.round(p1.calculaDistancia(p2));
        double lado2 = Math.round(p1.calculaDistancia(p3));
        double lado3 = Math.round(p2.calculaDistancia(p3));
        
        
        if( (lado1 + lado2 > lado3 ))
        {
            if( (lado1 + lado3 > lado2) )
            {
                if( lado2 + lado3 > lado1)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean equilatero()
    {
        if(!this.formaTriangulo(this.getP1(), this.getP2(), this.getP3()))
            return false;
        
        double lado1 = Math.round(p1.calculaDistancia(p2));
        double lado2 = Math.round(p1.calculaDistancia(p3));
        double lado3 = Math.round(p2.calculaDistancia(p3));
        
        if((lado1 == lado2) && (lado2 == lado3))
        {
            return true;
        }
        
        return false;
    }
    
    public boolean isosceles()
    {
        if(!this.formaTriangulo(this.getP1(), this.getP2(), this.getP3()))
            return false;
        
        double lado1 = Math.round(p1.calculaDistancia(p2));
        double lado2 = Math.round(p1.calculaDistancia(p3));
        double lado3 = Math.round(p2.calculaDistancia(p3));
        
        if((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))
            return true;
        
        else
            return false;
        
    }
    
    public boolean escaleno()
    {
        if(!this.formaTriangulo(this.getP1(), this.getP2(), this.getP3()))
            return false;
        
        double lado1 = Math.round(p1.calculaDistancia(p2));
        double lado2 = Math.round(p1.calculaDistancia(p3));
        double lado3 = Math.round(p2.calculaDistancia(p3));
        
        if( (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3) )
            return true;
        
        else
            return false;
    }
    
    public double perimetro()
    {   
        if(!this.formaTriangulo(this.getP1(), this.getP2(), this.getP3()))
            return 0;
        
        double lado1 = Math.round(p1.calculaDistancia(p2));
        double lado2 = Math.round(p1.calculaDistancia(p3));
        double lado3 = Math.round(p2.calculaDistancia(p3));
     
        double perimetroAux = 0;
        
        perimetroAux += lado1;
        perimetroAux += lado2;
        perimetroAux += lado3;
        
        return perimetroAux;
    }
    
    public double area()
    {        
        if(!this.formaTriangulo(this.getP1(), this.getP2(), this.getP3()))
            return 0;
     
        double lado1 = Math.round(p1.calculaDistancia(p2));
        double lado2 = Math.round(p1.calculaDistancia(p3));
        double lado3 = Math.round(p2.calculaDistancia(p3));
        
        double areaAux, sp;
        sp = perimetro()/2;
        
        areaAux = sp * (sp - lado1) * (sp - lado2) * (sp - lado3);
        
        areaAux = Math.sqrt(areaAux);
        
        return areaAux;
    }
}
