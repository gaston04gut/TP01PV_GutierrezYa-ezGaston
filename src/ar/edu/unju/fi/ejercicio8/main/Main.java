package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		long n;
		long resultado;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un Numero: ");
		n=scanner.nextInt();
		CalculadoraEspecial calculo = new CalculadoraEspecial(n);
		resultado=calculo.calcularSumatoria(n);
		System.out.println("Sumatoria: "+resultado);
		resultado=calculo.calcularProductoria(n);
		System.out.println("Sumatoria: "+resultado);
		scanner.close();

	}

}
