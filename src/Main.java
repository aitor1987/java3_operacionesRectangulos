import java.util.Scanner;

public class OperacionesRectangulo 
{

public static void main (String args[]) 
	{
 double base, altura;
 Rectangulo operaciones = new Rectangulo();
 
 Scanner sc = new Scanner(System.in);
 System.out.print("\ningresa la base del rectangulo a analizar: ");
 base = sc.nextDouble();
 operaciones.setBase(base);
 System.out.print("\ningresa la altura del rectangulo a analizar: ");
 altura = sc.nextDouble();
 operaciones.setAltura(altura);
 
 System.out.println("\nEl area del rectangulo es: " + operaciones.Area());

 System.out.println("\nEl perimetro del rectangulo es: " + operaciones.Peri());

 System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
