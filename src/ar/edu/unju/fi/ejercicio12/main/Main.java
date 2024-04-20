package ar.edu.unju.fi.ejercicio12.main;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		int dia=0;
		int mes=0;
		int anio;
		boolean correcto=false;
		String nombre;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de la Persona: ");
		nombre=scanner.next();
		
		System.out.println("Ingrese el año de Nacimiento: ");
		anio=scanner.nextInt();

		while(correcto==false) {
			System.out.println("Ingrese el mes de Nacimiento [1-12]");

			mes=scanner.nextInt();
			if(mes>0 && mes<=12) {
				mes--;
				correcto=true;
			}else {
				System.out.println("ingrese un mes valido");
			}
		}

		correcto=false;
		while(correcto==false) {
			System.out.println("Ingrese el dia de Nacimiento: ");
			dia=scanner.nextInt();
			if(dia>0 && dia<=31) {
				correcto=true;
			}else {
				System.out.println("Ingrese un dia valido");
			}
		}
		
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.set(anio, mes, dia);		
		
		
		
		Persona perso = new Persona(nombre, fechaNac);

		
		perso.mostrarDatos(perso);
			
	}

}
