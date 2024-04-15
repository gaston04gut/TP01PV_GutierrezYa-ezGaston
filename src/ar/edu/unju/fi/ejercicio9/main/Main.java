package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		int k;
		
		for(k=0;k<3;k++) {
		nuevoprod();
		}
	}
	public static Producto nuevoprod() {
		Scanner scanner = new Scanner(System.in);
		
		Producto prod1 = new Producto();
		
		System.out.println("Ingrese Nombre del Producto: ");
		String nombre=scanner.next();
		prod1.setNombre(nombre);
		
		System.out.println("Ingrese Codigo del producto");
		int cod=scanner.nextInt();
		prod1.setCodigo(cod);
		
		System.out.println("Ingrese el Precio del Producto");
		double precio=scanner.nextDouble();
		prod1.setPrecio(precio);
		
		System.out.println("¿Desea Ingresar un descuento? (s/n) ");
		
		char opc=scanner.next().charAt(0);
		int descuento;
		if(opc=='s') {
			boolean correcto=false; 
			while(correcto==false) {
				System.out.println("Ingrese la cantidad de descuento.");
				System.out.println("Recuerde que tiene que estar entre 1 y 50");
				descuento=scanner.nextInt();
				if(descuento > 0 && descuento <= 50) {
					System.out.println("descuento Generado con exito");
					correcto=true;
					prod1.setDescuento(descuento);
				}else {
					System.out.println("ERROR");
				}
			}
		}else {
			prod1.setDescuento(0);
		}
		prod1.mostrarPrecio(prod1);

		return prod1;
	}
}