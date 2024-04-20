package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tamanio=0;
		int i;
		int suma=0;
		boolean correcto=false;
		Scanner scanner = new Scanner(System.in);
		while(correcto==false) {
			System.out.println("Ingrese un numero entre 3 y 10");
			tamanio=scanner.nextInt();
			if(tamanio>=3 && tamanio<=10) {
				correcto=true;
			}else {
				System.out.println("ERROR");
			}
		}
		int[] numeros = new int[tamanio];
		for(i=0;i<tamanio;i++) {
			System.out.println("Ingrese un numero: ");
			numeros[i]=scanner.nextInt();
		}
		System.out.println("Cargado con exito");
		for(i=0;i<tamanio;i++) {
			System.out.println("["+i+"] = "+numeros[i]);
			suma=suma+numeros[i];
		}
		
		System.out.println("La suma de los numeros guardados en la Array es: "+suma);
	}

}
