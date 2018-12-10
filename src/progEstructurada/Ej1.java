package progEstructurada;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*1.Pedimos un numero al usuario
		 * 2. lo comparamos con el 0 para ver si es positivo, negativo o 0*/
		Scanner keyboard = new Scanner(System.in);
		int n;
		/*1. pedimos el numero*/
		System.out.println("Introduce un numero: ");
		n = keyboard.nextInt();
		
		/*2. comparamos y comprobamos*/
		if(n > 0) {
			System.out.println("El numero es positivo");
		}else if(n < 0) {
			System.out.println("El numero es negativo");
		}else {
			System.out.println("El numero es 0");
		}
		
		keyboard.close();
		
		
		
		
	}

}
