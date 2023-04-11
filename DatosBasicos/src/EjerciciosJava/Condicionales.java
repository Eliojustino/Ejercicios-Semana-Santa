 /*****************************************
 * Autor: Cruz Ortega Elio justino		  *
 * Fecha Creación: 08/04/23               *
 * Fecha Actualización:	10/04/23          *
 * Descripción: Ejercicios de semana santa*
 ******************************************/
package EjerciciosJava;

import java.util.Scanner;

public class Condicionales {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		// Programa 1
		System.out.println("Ingresé el número que va a ser el dividendo: ");
		double a = leer.nextDouble();
		System.out.println("Ingresé el número que va a ser el divisor: ");
		double b = leer.nextDouble();
		if (b == 0) {
			System.out.println("Error, ingresó un divisor igual a 0.");
		} else {
			double c = a/b;
			System.out.println("El resultado es: " + c);
		}
		
		// Programa 2
		System.out.println("Ingresá tu edad: ");
		int d = leer.nextInt();
		System.out.println("Ingresé la cantidad de ingresos mensuales: ");
		double e = leer.nextDouble();
		if (d > 16 && e >= 500) {
			System.out.println("Debes tributar impuestas.");
		}else {
			System.out.println("Aún no debe tributar impuestos.");
		}
		
		// Programa 3
		System.out.println("Ingresé un número de 4 digitos: ");
		int num = leer.nextInt();
		
		int d1 = num/1000;
		int d2 = (num/100) %10;
		int d3 = (num/10) %10;
		int d4 = num%10;
		if(d1 == d4 && d2 == d3) {
			System.out.println("Capicúa");
		} else {
			System.out.println("No lo es");
		}
		
		// Programa 4
        System.out.print("Ingrese su peso en kilogramos: ");
        double f= leer.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double g = leer.nextDouble();
        double imc = f / (g * g);
        System.out.printf("Su IMC es: %.2f\n", imc);
        if (imc < 16) {
            System.out.println("Clasificación: Criterio de ingreso");
        } else if (imc >= 16 && imc <= 16.9) {
            System.out.println("Clasificación: Infrapeso");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Clasificación: Obesidad premórbida");
        } else if (imc >= 40 && imc <= 45) {
            System.out.println("Clasificación: Obesidad mórbida");
        } else {
            System.out.println("Clasificación: Obesidad hipermórbida");
        }
	
	}
}
