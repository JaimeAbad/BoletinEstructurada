package progEstructurada;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int n1, n2,n3;
		
		/*1. pedimos 3 numeros aleatorios al usuario
		 * 2. comparamos los 3 numeros y los ordenamos ascendentemente*/
		System.out.println("Introduce 3 numeros aleatorios para ordenarlos ascendentemente: ");
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		keyboard.close();
		
		/*comprobamos todas las posibilidades y ordenamos ascendentemente*/
		if(n1 >= n2 && n1 >= n3 && n2 >= n3) {/*el 3 es el mayor*/
			System.out.printf("El orden ascendente es : %d%d%d", n3,n2,n1);
		}else if(n2 >= n1 && n2 >= n3 && n1>=n3) {/*el 3 es el mayor*/
			System.out.printf("El orden ascendente es : %d%d%d", n3,n1,n2);
		}else if(n1 >= n3 && n1 >= n2 && n3 >= n2) {/*el 2 es el mayor*/
			System.out.printf("El orden ascendente es : %d%d%d", n2,n3,n1);
		}else if (n3 >= n2 && n3 >= n1 && n1 >= n2) {/*el 2 es el mayor*/
			System.out.printf("El orden ascendente es : %d%d%d", n2,n1,n3);
		}else if(n2 >= n3 && n2 >= n1 && n3 >= n1){/*el 1 es el mayor*/
			System.out.printf("El orden ascendente es : %d%d%d", n1,n3,n2);
		}else if(n3 >= n2 && n3 >= n1 && n2 >= n1) {/*el 2 es el mayor*/
			System.out.printf("El orden ascendente es : %d%d%d", n1,n2,n3);
		}
	
	
	}

}
