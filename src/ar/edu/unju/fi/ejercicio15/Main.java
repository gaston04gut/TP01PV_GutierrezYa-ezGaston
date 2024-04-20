package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tamanio=0;
		int i;
		boolean correcto=false;
		Scanner scanner = new Scanner(System.in);
		while(correcto==false) {
			System.out.println("Ingrese un numero entre 5 y 10");
			tamanio=scanner.nextInt();
			if(tamanio>=5 && tamanio<=10) {
				correcto=true;
			}else {
				System.out.println("ERROR");
			}
		}
		String[] nombres = new String[tamanio];
		for(i=0;i<tamanio;i++) {
			System.out.println("Ingrese un nombre: ");
			nombres[i]=scanner.next();
		}
		System.out.println("");

		for(i=0;i<tamanio;i++) {
			System.out.println("["+i+"] = "+nombres[i]);
		}
		System.out.println("");
		for(i=tamanio-1;i>-1;i--) {
			System.out.println("["+i+"] = "+nombres[i]);
		}
	}

}
