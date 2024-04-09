package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k;
		int numero;
		System.out.println("Ingrese un Numero: ");

		if(scanner.hasNextInt()) {
			numero=scanner.nextInt();

			scanner.close();
			if(numero>=1 && numero<=9) {
				for(k=0;k<=10;k++) {
					System.out.println(numero + " * " + k + " = " + numero*k);
				}
			}else {
				if(numero>9) {
					System.out.println("El Numero es mayor a 9");
				}else{
					System.out.println("El numero es menor a 1");
				}
			}
		}else {
			System.out.println("ERROR: Debe Ingresar un Numero");
		}
		
	}

}
