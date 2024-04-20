package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numeros = new int[8];
		int i;
		Scanner scanner = new Scanner(System.in);
		for(i=0;i<8;i++) {
			System.out.println("Ingrese numero");
			numeros[i]=scanner.nextInt();
		}
		for(i=0;i<8;i++) {
			System.out.println("["+i+"] = "+numeros[i]);
		}
		scanner.close();

	}

}
