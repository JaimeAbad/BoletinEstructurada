package progEstructurada;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*1 pedimos al usuario el numero de horas que trabaja y que nos indique si trabaja de dia/noche y en festivo/no festivo
		 * 2. segun estos datos calcularemos el salario del dia de trabajo*/
		Scanner keyboard =  new Scanner(System.in);
		int turno, nHours, festivo;
		final float TARIFA_DIURNA = 3.0f, TARIFA_NOCTURNA = 4.8f, INCREMENTO_NOCTURNO = 1.8f, INCREMENTO_DIURNO = 1.2f;
		float jornalDiario  = 0.0f;
		System.out.println("Trabajas de dia o de noche ? 1-dia 2-noche: ");
		turno = keyboard.nextInt();
		System.out.println("Introduce el numero de horas: ");
		nHours = keyboard.nextInt();
		System.out.println("Es festivo ? 1.-si 2.- no");
		festivo = keyboard.nextInt();
		keyboard.close();
		
		if(turno == 1 && festivo == 1) {
			jornalDiario = nHours * (TARIFA_DIURNA + INCREMENTO_DIURNO);
			System.out.printf("El salario de tu dia de trabajo es de : %f " , jornalDiario);
		}else if (turno == 2 && festivo == 1) {
			jornalDiario = nHours * (TARIFA_NOCTURNA + INCREMENTO_NOCTURNO);
			System.out.printf("El salario de tu dia de trabajo es de : %f " , jornalDiario);
		}else if(turno == 1 && festivo == 2) {
			jornalDiario = nHours * TARIFA_DIURNA;
			System.out.printf("El salario de tu dia de trabajo es de : %f " , jornalDiario);
		}else if(turno == 2 && festivo == 2) {
			jornalDiario = nHours * TARIFA_NOCTURNA;
			System.out.printf("El salario de tu dia de trabajo es de : %f " , jornalDiario);
		}
		
		
		
		
		
		
		
		
	}

}
