package progEstructurada;

import static progEstructurada.Colores.NEGRO;
import static progEstructurada.Colores.RESET;
import static progEstructurada.Colores.ROJO;

import java.util.Random;
public class Ej8 {

	public static void main(String[] args) {

		/*1. generamos un numero entre 1 y 13 que sera el numero de la carta
		 * 2. generamos un numero entre 1 y 4 que sera el numero del palo
		 * 3. segun el numero, mostraremos un codigo que sera un simbolo de carta que le asignaremos
		 * 4. si el numero de la carta es 11 mostraremos una J, 12 mostraremos una Q y 13 mostraremos una K*/
		Random rnd = new Random(); 
		String pica = "\u2660", trebol = "\u2663", diamante="\u2666", corazon="\u2665";
		final int CARTA = 13;
		final int PALO = 4;
		int carta, palo;
		String cartaFinal;
		
		System.out.printf("Obteniendo numero de carta ... \n");
		carta = rnd.nextInt(CARTA) + 1;
		System.out.printf("Obteniendo palo ...\n");
		palo = rnd.nextInt(PALO);
		
		if(carta == 11) {
			cartaFinal = "JOTA";
		}else if(carta == 12) {
			cartaFinal = "REINA";
		}else if(carta == 13) {
			cartaFinal ="REY";
		}else {
			cartaFinal = String.valueOf(carta);
		}
		
		if(palo == 0) {
			cartaFinal = cartaFinal + NEGRO + pica + RESET;
		}else if(palo == 1) {
			cartaFinal+= NEGRO + trebol + RESET;
		}else if(palo == 2) {
			cartaFinal+= ROJO + diamante + RESET;
		}else {
			cartaFinal+= ROJO + corazon + RESET;
		}
		
		
		System.out.printf("La carta es: \n%s", cartaFinal);
		
		
	}

}
