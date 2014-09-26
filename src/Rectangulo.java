public class Rectangulo {



private double base;
private double altura;
private double perimetro;
private double superficie;

public void setMedidas(double base, double altura) 
{
this.base = base;
this.altura = altura;
perimetro = (2*base) +(2*altura);
superficie = base*altura;
}

public double getPerimetro() 
{	
return perimetro;
}

public double getSuperficie() 
{	
return superficie;
}

}

