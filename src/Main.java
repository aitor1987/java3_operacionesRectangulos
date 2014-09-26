import java.util.Scanner;

public class Main 
{

public static void main (String args[]) 
{
double base;
double altura;
Rectangulo operaciones = new Rectangulo();

Scanner sc = new Scanner(System.in);
System.out.print("\ningresa la base del rectangulo a analizar: ");
base = sc.nextDouble();

System.out.print("\ningresa la altura del rectangulo a analizar: ");
altura = sc.nextDouble();

//resultado = operaciones.area(radio);
operaciones.setMedidas(base, altura);
System.out.println("\nEl perimetro del rectangulo es: " + operaciones.getPerimetro());

//resultado = operaciones.circu(radio); 
System.out.println("\nLa superficie del rectangulo es: " + operaciones.getSuperficie());

System.out.println("\n\nEGUN ONA IZAN!!\n");
}
}
