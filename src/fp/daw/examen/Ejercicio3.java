package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

	/* 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e indique si éste es guay.
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Programa para calcular si un número es guay.");
		
		//comprobamos que nos escribar un numero entero positivo
		int num1 = -1;
		while (num1 < 0){
			System.out.println("Escribe un numero entero positivo:");
			num1 = Integer.parseInt(in.readLine());
		}
		
		//sumamos los numeros enteros anteriores al numero paa comprobar si es guay
		int resultado = 0;
		for (int i=0; i<num1; i++){

		}
			
	}

}
