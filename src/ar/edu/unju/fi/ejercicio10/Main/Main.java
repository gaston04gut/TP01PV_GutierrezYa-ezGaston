package ar.edu.unju.fi.ejercicio10.Main;


import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Pizza pizza = new Pizza();
		menu.generarMenu(pizza);

	}

}
