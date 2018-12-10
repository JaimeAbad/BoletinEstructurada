package progEstructurada;

import java.util.Random;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*1. pedimos una cadena al usuario
		 * 2. sacamos aleatoriamente un caracter de este cadena y su posicion en ella*/
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		String cadena;
		char character;
		int position;
		
		
		System.out.println("Introduce una cadena: ");
		cadena = keyboard.nextLine();	
		keyboard.close();
		
		//sacamos aleatoriamente una posicion de la cadena, el aleatorio lo sacara de numeros de entre el tamaño de la cadena
		position = rnd.nextInt(cadena.length());
		//sacamos de la cadena el caracter de la posicion que hemos obtenido aleatoriamente
		character = cadena.charAt(position);
		System.out.println(character);
		
	}

}
