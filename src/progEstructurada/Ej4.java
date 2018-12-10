package progEstructurada;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner keyboard =  new Scanner(System.in);
		/*1. pediremos al usuario el numero de dias de estancia y el numero de km que realiza
		 * 2. calculamos con los datos anteriores el precio del billete*/
		final float PRECIO_KM = 0.35f;
		final float DESCUENTO = 0.3f;
		float precio, distancia;
		int nDays;
		
		System.out.println("Introduce el numero de dias de estancia: ");
		nDays = keyboard.nextInt();
		System.out.println("Introduce el numero de km de distancia totales: ");
		distancia = keyboard.nextInt();
		keyboard.close();
		
		precio = distancia * PRECIO_KM;
				
		if(nDays > 7 && distancia > 1000) {
			precio = precio - (precio * DESCUENTO);
		}
		
		System.out.printf("El precio del billete es %.2f",precio);
		
	}

}
