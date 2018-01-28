package adivina;

import java.util.Scanner;

public class juegoazar {

	public static void main(String[] args) {
		//inicializamos la variable scanner para guardar los valores
		Scanner sc = new Scanner(System.in);
		int jugador=0;
		int intentos=0;
		// declaramos la variable premio y randomizamos el numero ganador
		int premio=(int)Math.floor(Math.random()*(10))+1;
		//utilizamos do while para repetir el proceso hasta que se acierte el numero
		do {
		System.out.println("introduzca un numero");
		jugador = sc.nextInt();
		// utilizamos if y else para saber si el numero introducido es mayor o menor
		if(jugador > premio) {
			System.out.println("el numero es menor");
			intentos++;
			
		}
		else if(jugador < premio) {
			System.out.println("el numero es mayor");
			intentos++;
		}
	
		
	
		

	}while(jugador!=premio);
		System.out.println("ha acertado el numero");
		System.out.println("numero de intentos"+intentos);
		sc.close();
	}

}
