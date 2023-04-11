 /*****************************************
 * Autor: Cruz Ortega Elio justino		  *
 * Fecha Creación: 08/04/23               *
 * Fecha Actualización:	10/04/23          *
 * Descripción: Ejercicios de semana santa*
 ******************************************/
package EjerciciosJava;

import java.util.Scanner;

public class DatosBasicos2 {
	public static void main(String[] args) {
		// Programa 7
		int a, b, c, d, e, f, g, j, k, l, m, n;
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Cuantos payasos fueron vendidos en el último periodo: ");
		a = leer.nextInt();
		System.out.print("Cuantas muñecas fueron vendidas en el último periodo: ");
		b = leer.nextInt();
		c = 112*a;
		d = 75*b;
		e = c+d;
		System.out.println("El peso total del paquete del último periodo es: " + e);
		System.out.println(" ");
		
		// Programa 8
		System.out.print("Introduce la distancia que se recorrio (en metros): ");
		f = leer.nextInt();
		System.out.print("Introduce el tiempo que le tomo al objeto recorrer dicha distancia (en segundos): ");
		g = leer.nextInt();
		float h = f/g;
		float i = (float) (h*3.6);
		System.out.println("La velocidad a la que el objeto se mueve es de " + h + "k/m");
		System.out.println(" ");
		
		// Programa 9 
		System.out.println("Ingrese el coeficiente a: ");
		double x = leer.nextDouble();
		System.out.println("Ingrese el coeficiente b: ");
		double y = leer.nextDouble();
		System.out.println("Ingrese el coeficiente c: ");
		double z = leer.nextDouble();
		
		double discriminante = Math.sqrt(y*y-4*x*z);
		double x1 = (-b+discriminante)/(2*x);
		double x2 = (-b-discriminante)/(2*x);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
}