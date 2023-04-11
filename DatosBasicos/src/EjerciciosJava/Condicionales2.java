 /*****************************************
 * Autor: Cruz Ortega Elio justino		  *
 * Fecha Creación: 08/04/23               *
 * Fecha Actualización:	10/04/23          *
 * Descripción: Ejercicios de semana santa*
 ******************************************/
package EjerciciosJava;

import java.util.Scanner;

public class Condicionales2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		// Programa 5
        System.out.print("Ingrese su peso en libras: ");
        double a = leer.nextDouble();
        System.out.print("Ingrese su estatura en centimetros: ");
        double b = leer.nextDouble();
        
        double c = a * 0.453592;
        double d = b / 100.0;
        double imc = c/ (d * d);

        String clasificacion;
        if (imc < 16) {
            clasificacion = "Criterio de ingreso";
        } else if (imc < 16.9) {
            clasificacion = "Infrapeso";
        } else if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc < 25) {
            clasificacion = "Peso normal";
        } else if (imc < 30) {
            clasificacion = "Sobrepeso";
        } else if (imc < 35) {
            clasificacion = "Obesidad premórbida";
        } else if (imc < 40) {
            clasificacion = "Obesidad mórbida";
        } else {
            clasificacion = "Obesidad hipermórbida";
        }
        System.out.printf("Peso en kilogramos: %.2f kg\n", c);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Clasificación: " + clasificacion);
        
        // Programa 6
        System.out.println("Ingresá un número del 1 al 12: ");
        int numMes = leer.nextInt();

        switch (numMes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Número inválido. Debe ser del 1 al 12.");
                break;
        }
	}
}
