package EjerciciosJava;

import java.util.Scanner;
import java.util.*;

public class DatosBasicos {
	public static void main(String[] args) {
		// Programa 1
		int h, p;
		int pagaTotal = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Cuantas horas se han trabajado: ");
		h = leer.nextInt();
		System.out.print("A cuanto es pagada la hora de trabajo en pesos: ");
		p = leer.nextInt();
		
		pagaTotal = h*p;
		System.out.println("Paga Total correspondiente: " + pagaTotal);
		System.out.println(" ");
		
		// Programa 2
		float resultado = 0;
		int x = 5;
		int y = 10;
		int a = 15;
		int b = 20;
		
		resultado = (x+y)/(a*b);
		System.out.println("El resultado es: " + resultado);
		System.out.println(" ");
		
		// Programa 3
		int aux = 0;
		int aux2 = 0;
		int z = 15;
		float resultado1 = 0;
		aux = (x+y*z);
		aux2 = (int) Math.pow(aux,5);
		resultado1 = (float) Math.sqrt(aux2);
		System.out.println("El resultado de la operación es: " + resultado1);
		System.out.println(" ");
		
		// Programa 4
		int n, m, c, r;
		System.out.print("Ingresé el número n: ");
		n = leer.nextInt();
		System.out.print("Ingresé el número m: ");
		m = leer.nextInt();  
		c = n/m;
		r = n%m;
		System.out.println(n + " entre " + m + " da un cociente " + c + " y un resto " + r); 
		System.out.println(" ");
		
		// Programa 5
		int cat1, cat2, u;
		System.out.print("Introduzca el cateto 1: ");
		cat1 = leer.nextInt();
		System.out.print("Introduzca el cateto 2: ");
		cat2 = leer.nextInt();
		u = ((cat1*cat1) + (cat2*cat2));
		double hipo = Math.sqrt(u);
		System.out.println("El valor de la hipotenusa es: " + hipo);
		System.out.println(" ");
		
		// Programa 6
		int num;
		System.out.print("Ingresé un número entero de 4 digitos: ");
		num = leer.nextInt();
		int digito1 = num%10;
		int digito2 = (num/10)%10;
		int digito3 = (num/100)%10;
		int digito4 = num/1000;
		int numReverso = digito1*1000 + digito2*100 + digito3*10 + digito4;
		System.out.println("El número al revez es: " + numReverso);
		System.out.println(" ");
		
		
	}
}
