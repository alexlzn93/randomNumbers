package random_numbers;

import java.util.Scanner;

public class Random_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		System.out.println("introduzca un numero");
		int num= entrada.nextInt();
		System.out.println("Su contraseña generada de " + num + " numeros es: ");
		System.out.println(randomNumber(num));
		entrada.close();
		
	}
/**
 * Metodo que genera una cadena de caracteres aleatorios con el tamaño del numero 
 * que le pasemos al parametro
 * Ej:
 * Introduzca numero -->8
 * SU74HP1X
 * @param number
 * @return contraseña aleatoria con nombres y numeros
 */
	public static String randomNumber(int number) {
		
		String caracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		StringBuilder sb= new StringBuilder();
		while(number--!=0) {
			System.out.println(number);
			int caracter= (int) (Math.random()* caracteres.length());
			sb.append(caracteres.charAt(caracter));
		
		}
		
		return sb.toString();
	}
}
