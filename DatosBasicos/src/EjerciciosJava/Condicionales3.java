 /*****************************************
 * Autor: Cruz Ortega Elio justino		  *
 * Fecha Creación: 08/04/23               *
 * Fecha Actualización:	10/04/23          *
 * Descripción: Ejercicios de semana santa*
 ******************************************/
package EjerciciosJava;

import java.util.Scanner;

public class Condicionales3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		// Programa 7
		System.out.print("Introduce un número de cuatro dígitos: ");
        int num = leer.nextInt();
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;
        if (d1 > d2 && (d1 * 10 + d2) > (d3 * 10 + d4)) {
            if (d1 > d2 && d2 > d3 && d3 > d4) {
                System.out.println("El número es muy feliz");
            } else {
                System.out.println("El número es feliz pero no creciente");
            }
        } else {
            System.out.println("El número es infeliz");
        }
        
        // Programa 8
        System.out.println("Ingresé el extremo izquierdo del intervalo: ");
        int x = leer.nextInt();
        System.out.println("Ingresé el extremo derecho del intervalo: ");
        int y = leer.nextInt();
        System.out.println("Ingresa un número para buscarlo en el intervalo: ");
        int w = leer.nextInt();
        if(w >= x && w <= y) {
        	System.out.println("El núermo introducido está dentro del intervalo.");
        }else {
        	System.out.println("El número introducido está fuera del intervalo.");
        }

	}
}
