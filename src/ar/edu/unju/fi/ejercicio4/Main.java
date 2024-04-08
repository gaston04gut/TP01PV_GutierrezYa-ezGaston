package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int resultado;
		int factorial = 1;
		int contador = 1;
		System.out.println("Ingrese un numero ");
		if(scanner.hasNextInt()) {
			numero=scanner.nextInt();	
			if(numero>=0 && numero<=10) {
				        while (contador <= numero) {
				            factorial *= contador;
				            contador++;
				        }
					resultado=factorial;
				System.out.println(resultado);
			}else {
				if(numero>10) {
					System.out.println("El numero es mayor a 10");	
				}else {
					System.out.println("El numero es Menor a 0");
				}
			}
		}else {
			System.out.println("Debe Ingresar un Numero valido");
		}
		scanner.close();
	}

}
