package progEstructurada;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	
	/*1. Pedimos 3 numeros al usuario
	 * 2. los comparamos y vemos si hay 2 iguales, son todos iguales o no hay ninguno igual*/
	int n1,n2,n3;
	/*1 pedimos los numeros*/
	System.out.println("Introduce 3 numeros y veremos si son iguales.");
	System.out.println("Numero1: ");
	n1 = keyboard.nextInt();
	System.out.println("Numero2: ");
	n2 = keyboard.nextInt();
	System.out.println("Numero3: ");
	n3 = keyboard.nextInt();
	
	/*2hacemos la comparacion*/
	if(n1 == n2 && n2 == n3) {
		System.out.printf("Hay 3 numero iguales a %d",n1);
	}else if(n1 == n2 || n1 == n3){
		System.out.printf("Hay dos numeros iguales a %d",n1);
	}else if(n2 == n3) {
		System.out.printf("Hay dos numeros iguales a %d",n2);
	}else {
		System.out.println("No hay numeros iguales");
	}

	keyboard.close();
}
}

