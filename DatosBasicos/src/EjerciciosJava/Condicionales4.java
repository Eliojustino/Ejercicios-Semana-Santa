 /*****************************************
 * Autor: Cruz Ortega Elio justino		  *
 * Fecha Creación: 08/04/23               *
 * Fecha Actualización:	10/04/23          *
 * Descripción: Ejercicios de semana santa*
 ******************************************/
package EjerciciosJava;

import java.util.Scanner;

public class Condicionales4 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

	      // Pedimos la hora exacta
	      System.out.print("Ingrese la hora (HH:MM:SS AM/PM): ");
	      String horaStr = leer.nextLine();

	      // Convertimos la hora a segundos
	      int segundos = convertirASegundos(horaStr);

	      // Imprimimos el número de segundos transcurridos
	      System.out.println("Han transcurrido " + segundos + " segundos en el día.");
	   }

	   public static int convertirASegundos(String horaStr) {
	      int segundos = 0;

	      // Separamos la hora, minutos, segundos y AM/PM
	      String[] partes = horaStr.split(" ");
	      String[] partesHora = partes[0].split(":");

	      // Convertimos la hora a formato de 24 horas
	      int horas = Integer.parseInt(partesHora[0]);
	      if (partes[1].equals("PM") && horas != 12) {
	         horas += 12;
	      } else if (partes[1].equals("AM") && horas == 12) {
	         horas = 0;
	      }

	      // Convertimos la hora a segundos
	      segundos += horas * 3600;
	      segundos += Integer.parseInt(partesHora[1]) * 60;
	      segundos += Integer.parseInt(partesHora[2]);

	      return segundos;		
	}
}



