package progEstructurada;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int n1, n2;
		
		/*1. Pedimos dos numeros enteros al usuario
		 * 2. los dividimos y si el resto es 0 podemos decir que son multiplos, si es distinto, no son multiplos
		 * */
		
		/*1. Pedimos los numeros*/
		System.out.println("Introduce un numero: ");
		n1 = keyboard.nextInt();
		System.out.println("Introduce otro numero: ");
		n2 = keyboard.nextInt();
		
		/*obtenemos el resto y comprobamos el resultado*/
		if(n1%n2 == 0) {
			System.out.printf("%d es multiplo de %d",n1,n2);
		}else {
			System.out.println("Estos numeros no son multiplos");
		}
		
		keyboard.close();
	}

}
