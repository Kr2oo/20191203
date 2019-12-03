package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	/* 
	 * 4 puntos
	 * 
	 * Escribir en el método main un programa que pida por teclado un número decimal menor o igual
	 * que 3000 y muestre por pantalla el resultado de convertirlo a un número romanos.
	 *     
	 *     La conversión se realizará transformando individualmente cada dígito, empezando por el correspondiente
	 *     a las unidades de millar, seguido de las centenas, decenas y unidades de la forma siguiente:
	 *     
	 *     		Dígito decimal		|	Transformación
	 *     		--------------------|----------------------------------------------------------------------------
	 *     		1, 2 o 3			|	Escribir C1 de una a tres veces
	 *     		4					|	Escribir C1 seguido de C2
	 *     		5, 6, 7 o 8			|	Escribir una vez C2 seguido de C1 de cero a tres veces
	 *     		9					|	Escribir C1 seguido de C3
	 *     
	 *     donde C1, C2 y C3 son los caracteres de numeración romana que corresponda según la tabla siguiente:
	 *     
	 *     							|   C1   |   C2   |   C3   |
	 *     		--------------------|--------|--------|--------|        
	 *     		unidades			|	I    |   V    |   X    |
	 *     		decenas				|	X    |   L    |   C    |
	 *     		centenas			|	C    |   D    |   M    |
	 *     		unidades de millar	|	M    |        |        |
	 *     
	 *     Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Programa para convertir a numeros romanos.");
		System.out.println("Escribe un numero entero entre 1 y 3000");
		int num = 0;
		
		//Pedimos el numero por consola
		while ((num < 1) || (num > 3000)){
			System.out.println("Escribe un numero entero positivo:");
			num = Integer.parseInt(in.readLine());
		}
		
		String numero = String.valueOf(num);
		String resultado = "";
		
		
		//Calculamos los millares
		if (num > 999) {
			char m = numero.charAt(0);
			resultado += millares(m);
			
			//Calculamos Centenas
			char c = numero.charAt(1);
			resultado += centenas(c);
			
			//Calculamos Decenas
			char d = numero.charAt(2);
			resultado += decenas(d);
			
			//Calculamos Unidades
			char u = numero.charAt(4);
			resultado += unidades(u);
			
		} else if ((num > 99) && (num < 1000)) {
			
			//Calculamos Centenas
			char c = numero.charAt(0);
			resultado += centenas(c);
			
			//Calculamos Decenas
			char d = numero.charAt(1);
			resultado += decenas(d);
			
			//Calculamos Unidades
			char u = numero.charAt(2);
			resultado += unidades(u);
			
		} else if ((num > 9) && (num < 100)) {
			
			//Calculamos Decenas
			char d = numero.charAt(0);
			resultado += decenas(d);
			
			//Calculamos Unidades
			char u = numero.charAt(1);
			resultado += unidades(u);
			
		} else {
			
			//Calculamos Unidades
			char u = numero.charAt(0);
			resultado += unidades(u);
			
		}
		
		System.out.println("El resultado es " + resultado);
		
	}
	
	private static String millares(char m){
		String resultado = "";
		
		if ((m == '3') || (m == '2') || (m == '1')){
			if (m == '3'){
				resultado += "MMM";
			}else if (m == '2'){
				resultado += "MM";
			} else {
				resultado += "M";
			}
		}
			
		return resultado;
	}
	
	private static String centenas(char m){
		String resultado = "";
		
		if ((m == '3') || (m == '2') || (m == '1')){
			if (m == '3'){
				resultado += "CCC";
			}else if (m == '2'){
				resultado += "CC";
			} else {
				resultado += "C";
			}
		} else if(m == '4'){
			resultado += "CD";
		} else if ((m == '5') || (m == '6') || (m == '7') || (m == '8')){
			if (m == '5'){
				resultado += "D";
			}else if (m == '6'){
				resultado += "DC";
			} else if (m == '7'){
				resultado += "DCC";
			} else {
				resultado += "DCCC";
			}
		} else if (m == '9'){
			resultado += "CM";
		}
						
		return resultado;
	}
	
	private static String decenas(char m){
		String resultado = "";
		
		if ((m == '3') || (m == '2') || (m == '1')){
			if (m == '3'){
				resultado += "XXX";
			}else if (m == '2'){
				resultado += "XX";
			} else {
				resultado += "X";
			}
		} else if(m == '4'){
			resultado += "XL";
		} else if ((m == '5') || (m == '6') || (m == '7') || (m == '8')){
			if (m == '5'){
				resultado += "L";
			}else if (m == '6'){
				resultado += "LX";
			} else if (m == '7'){
				resultado += "LXX";
			} else {
				resultado += "LXXX";
			}
		} else if (m == '9'){
			resultado += "XC";
		}
			
		return resultado;
	}
	
	private static String unidades(char m){
		String resultado = "";
		
		if ((m == '3') || (m == '2') || (m == '1')){
			if (m == '3'){
				resultado += "III";
			}else if (m == '2'){
				resultado += "II";
			} else {
				resultado += "I";
			}
		} else if(m == '4'){
			resultado += "IV";
		} else if ((m == '5') || (m == '6') || (m == '7') || (m == '8')){
			if (m == '5'){
				resultado += "V";
			}else if (m == '6'){
				resultado += "VI";
			} else if (m == '7'){
				resultado += "VII";
			} else {
				resultado += "VIII";
			}
		} else if (m == '9'){
			resultado += "IX";
		}
			
		return resultado;
	}
}
