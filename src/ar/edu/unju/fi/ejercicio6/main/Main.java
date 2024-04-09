package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;



public class Main {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		Persona persona1 = generarPersona1();
		System.out.println("\n");
		mostrarPersona(persona1,hoy);
		System.out.println("\n");
		Persona persona2 = generarPersona2();
		mostrarPersona(persona2, hoy);
		System.out.println("\n");
		Persona persona3 = generarPersona3();
		mostrarPersona(persona3, hoy);
		System.out.println("\n");
		System.out.println("Fin Del Programa");
	}

	public static Persona generarPersona1() {
		int anio;
		int mes;
		int dia;
		Persona persona1 = new Persona();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese DNI");
		String dni=scanner.next();
		persona1.setDni(dni);
		
		System.out.println("Ingrese Nombre");
		String nombre=scanner.next();
		persona1.setNombre(nombre);
		
		System.out.println("Ingrese Anio Nacimiento");
		anio=scanner.nextInt();
		System.out.println("Ingrese Mes Nacimiento");
		mes=scanner.nextInt();
		System.out.println("Ingrese Dia Nacimiento");
		dia=scanner.nextInt();
		persona1.setFechaNacimiento(LocalDate.of(anio, mes, dia));
		
		System.out.println("Ingrese Provincia");
		String prov=scanner.next();
		persona1.setProvincia(prov);

		return persona1;
	}	
	public static Persona generarPersona2() {
		int anio;
		int mes;
		int dia;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese DNI");
		String dni=scanner.next();

		
		System.out.println("Ingrese Nombre");
		String nombre=scanner.next();

		System.out.println("Ingrese Anio Nacimiento");
		anio=scanner.nextInt();
		System.out.println("Ingrese Mes Nacimiento");
		mes=scanner.nextInt();
		System.out.println("Ingrese Dia Nacimiento");
		dia=scanner.nextInt();

		System.out.println("Ingrese Provincia");
		String prov=scanner.next();

		Persona persona1= new Persona(dni, nombre, LocalDate.of(anio, mes, dia),prov);

		return persona1;
	}	
	public static Persona generarPersona3() {
		int anio;
		int mes;
		int dia;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese DNI");
		String dni=scanner.next();

		
		System.out.println("Ingrese Nombre");
		String nombre=scanner.next();

		System.out.println("Ingrese Anio Nacimiento");
		anio=scanner.nextInt();
		System.out.println("Ingrese Mes Nacimiento");
		mes=scanner.nextInt();
		System.out.println("Ingrese Dia Nacimiento");
		dia=scanner.nextInt();

		Persona persona1= new Persona(dni, nombre, LocalDate.of(anio, mes, dia));
		scanner.close();
		return persona1;
	}	
	
	public static void mostrarPersona(Persona persona, LocalDate fechaHoy) {
		Persona.mostrarDatos(persona, fechaHoy);
	}
}
