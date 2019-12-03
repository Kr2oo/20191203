package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números enteros y calcule
	 * la suma de todos los números impares comprendidos entre ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se introduzcan los dos números
	 * (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Programa para calcular la suma de los numeros impares entre dos numeros.");
		
		System.out.println("Escribe el primer n�mero entero:");
		int num1 = Integer.parseInt(in.readLine());
		
		System.out.println("Escribe el segundo n�mero entero:");
		int num2 = Integer.parseInt(in.readLine());
		
		//Si el numero 1 es mayor, empezamos desde el numero 2
		//Si el numero 2 es mayor, empezamos desde el numero 1
		int inicio = 0;
		int fin = 0;
		
		if (num1 > num2){
			inicio = num2;
			fin = num1;
		} else {
			inicio = num1;
			fin = num2;	
		}
		
		int resultado = 0;
		//buscamos los numeros desde el numero peque�o hasta el numero grande
		for (int i = inicio; i <= fin; i++){
			
			//Comprobamos si el numero es impar
			if (i % 2 != 0){
				resultado += i;
			}
		}
		
		//Mostramos por pantalla el resultado
		System.out.println("El resultado es " + resultado);
	}

}
