package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Empleado empleado = generarEmpleado();
		
		mostrarDatos(empleado);
		System.out.println("\nAplicando Aumento...");
		empleado.aumentarSalario(empleado);
		System.out.println("\n");
		mostrarDatos(empleado);
	}
	
	public static Empleado generarEmpleado() {
		String nombre;
		int legajo;
		double salario;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el Nombre del Empleado: ");
		nombre=scanner.next();
		System.out.println("Ingrese el Legajo del Empleado: ");
		legajo = scanner.nextInt();
		System.out.println("Ingrese el Salario del Empleado: ");
		salario = scanner.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		scanner.close();
		return empleado;
	}
	
	public static void mostrarDatos(Empleado empleado) {
		empleado.mostrarEmpleado(empleado);
	}
}
