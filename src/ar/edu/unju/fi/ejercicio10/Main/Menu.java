package ar.edu.unju.fi.ejercicio10.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Menu {
	char respuesta='n';
	int opcion=0;

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public char getRespuesta() {
		return respuesta;
	}




	public void setRespuesta(char respuesta) {
		this.respuesta = respuesta;
	}




	public int getOpcion() {
		return opcion;
	}




	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}




	public void generarMenu(Pizza pizza) {
		boolean correcto=false;
		int cont=0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("_________________________");
			System.out.println("Genere su Pizza");
			do {
				System.out.println("Ingrese 1 - Pizza pequeña de diametro");
				System.out.println("Ingrese 2 - Pizza Mediana de diametro");
				System.out.println("Ingrese 3 - Pizza Grande de diametro");
				System.out.print("Ingrese una opcion: ");
				opcion = scanner.nextInt();
				if(opcion < 1 || opcion > 3) {
					System.out.println("ERROR");
				}else {
					correcto=true;
					cont++;
				}
			}while(correcto==false);
			correcto=false;
			do {
				System.out.println("¿La Pizza lleva Ingredientes Especiales? (s/n)");
				respuesta=scanner.next().charAt(0);
				if(respuesta != 's' && respuesta != 'n') {
					System.out.println("ERROR");
				}else{
					correcto=true;
				}
			}while(correcto==false);

			cargarDatosPizza(pizza);
			System.out.println(pizza.toString(cont));

			System.out.println("¿Desea encargar otra Pizza? (s/n)");
			respuesta=scanner.next().charAt(0);

		}while(respuesta != 'n');

		System.out.println("Programa Finalizado");
		scanner.close();
	}

	public void cargarDatosPizza(Pizza pizza) {
		switch (opcion) {
		case 1:
			pizza.setDiametro(20);
			break;
		case 2:
			pizza.setDiametro(30);
			break;
		case 3:
			pizza.setDiametro(40);
			break;
		}
		if(respuesta=='s') {
			pizza.setIngredientesEsp(true);
		}else {
			pizza.setIngredientesEsp(false);
		}
		pizza.calcularPrecio();
		pizza.calcularArea(pizza);
	}
}