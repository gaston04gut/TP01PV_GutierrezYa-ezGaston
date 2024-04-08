package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero=0;
		
		System.out.println("Ingrese un Numero: ");
		if(scanner.hasNextInt()) {
			numero=scanner.nextInt();
			if(numero%2==0) {
				numero=numero*3;
			}else {
				numero=numero*2;
			}
			System.out.println(numero);
		}else {
			System.out.println("Debe Ingresar un Numero Valido.");
		}
		scanner.close();
	}

}
