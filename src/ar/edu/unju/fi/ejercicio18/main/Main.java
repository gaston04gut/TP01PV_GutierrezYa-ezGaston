package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		int opcion=0;
		Scanner scanner = new Scanner(System.in);
		List<Pais> arrayPais = new ArrayList<Pais>();
		List<DestinoTuristico> arrayDestinoTurstico = new ArrayList<DestinoTuristico>();
		cargarPaises(arrayPais);

		do {
			System.out.println("--- MENU ---");
			System.out.println("1 – Alta de Destino Turistico");
			System.out.println("2 – Mostrar todos los Destinos Turisticos ");
			System.out.println("3 – Modificar el Pais de un Destino Turistico.");
			System.out.println("4 – Limpiar el Arraylist de Destino Turistico");
			System.out.println("5 – Eliminar un Destino Turistico");
			System.out.println("6 – Mostrar Destino Turistico ordenado por nombre.");
			System.out.println("7 – Mostrar todos los Paises");
			System.out.println("8 – Mostrar los Destinos Turisticos que pertenecen a un Pais");
			System.out.println("9 – Salir");
			System.out.println("Ingrese opcion: ");
			opcion=scanner.nextInt();

			switch(opcion) {
			case 1:
				arrayDestinoTurstico.add(crearDestinoTuristico(arrayPais));

				break;
			case 2:
				mostrarDestinoTuristico(arrayDestinoTurstico);
				break;
			case 3:
				modificarPais(arrayDestinoTurstico);
				break;
			case 4:
				limpiarDestino(arrayDestinoTurstico);
				break;
			case 5:
				eliminarDestino(arrayDestinoTurstico);
				break;
			case 6:
				ordenarDestino(arrayDestinoTurstico);
				break;
			case 7:
				mostrarPaises(arrayPais);
				break;
			case 8:
				mostrarDestinoPais(arrayDestinoTurstico);
				break;
			case 9:
				System.out.println("Adios");
				break;
			default:
				System.out.println("ERROR");
			}

		}while(opcion!=9);
	}

	//cargar lista paises
	public static void cargarPaises(List<Pais> paises) {
		paises.add(new Pais("p1", "Argentina"));
		paises.add(new Pais("p2", "Bolivia"));
		paises.add(new Pais("p3", "Chile"));
		paises.add(new Pais("p4", "Uruguay"));
		paises.add(new Pais("p5", "Brasil"));
	}
	public static void mostrarPaises(List<Pais> paises) {
		for(Pais pais:paises) {
			System.out.println("---------------");
			System.out.println(pais.toString());
			System.out.println("---------------");
		}
	}
	public static boolean buscarPais(List<Pais> paises, String cod) {
		boolean encontrado=false;
		for(int i=0;i<paises.size();i++) {
			if(paises.get(i).getCodigoPais().equalsIgnoreCase(cod)) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	//fin carga

	//1 - Alta Paises
	public static DestinoTuristico crearDestinoTuristico(List<Pais> paises) {
		String codigo="null";
		String nombre="null";
		Double precio=0.;
		String codigoP="null";
		String nombreP="null";
		int cantDias=0;

		boolean correcto=false;
		boolean diaCorrecto=false;
		boolean PrecioCorrecto=false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese El Codigo del Destino Turistico");
		codigo=scanner.next();
		System.out.println("Ingrese Nombre del Destino Turistico");
		nombre = scanner.next();


		do {
			try {
				System.out.println("Ingrese Precio");
				precio=scanner.nextDouble();
				PrecioCorrecto=true;
			}catch(InputMismatchException ex) {
				System.out.println("Ingreso Incorrecto de Datos");
				scanner.next();
			}
		}while(!PrecioCorrecto);

		do {

			System.out.println("Ingrese Codigo del Pais");
			mostrarPaises(paises);
			System.out.println("");
			System.out.println("Ingrese Codigo del Pais: ");
			codigoP=scanner.next();
			if(buscarPais(paises, codigoP)) {
				//codigo es correcto
				for(int i=0;i<paises.size();i++) {
					if(paises.get(i).getCodigoPais().equalsIgnoreCase(codigoP)) {
						nombreP=paises.get(i).getNombrePais();
					}
				}
					correcto=true;
				
			}else {
				System.out.println("Codigo Invalido");
			}
			}while(!correcto);

			do {
				try {
					System.out.println("Ingrese Cantidad de Dias");
					cantDias=scanner.nextInt();
					diaCorrecto=true;
				}catch(InputMismatchException ex) {
					System.out.println("Ingreso Incorrecto de Datos");
					scanner.next();
				}
			}while(!diaCorrecto);

		DestinoTuristico destinoTuristico = new DestinoTuristico();
		destinoTuristico.setCodigo(codigo);
		destinoTuristico.setNombre(nombre);
		destinoTuristico.setPrecio(precio);
		destinoTuristico.setCodigoPais(codigoP);
		destinoTuristico.setNombrePais(nombreP);
		destinoTuristico.setCantDias(cantDias);
		return destinoTuristico;
	}

	// 2 - Mostrar
	public static void mostrarDestinoTuristico(List<DestinoTuristico> destino) {
		for(DestinoTuristico dt:destino) {
			System.out.println("----------------------");
			System.out.println(dt.toString());
			System.out.println("----------------------");
		}
	}
	//fin mostrar
	
	//buscarDestino
	public static boolean buscarDestino(List<DestinoTuristico> destino, String cod) {
		boolean encontrado=false;
		for(int i=0;i<destino.size();i++) {
			if(destino.get(i).getCodigoPais().equalsIgnoreCase(cod)) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	//fin buscardestino
	
	// 3 - Modificar Pais
	
	public static void modificarPais(List<DestinoTuristico> destino) {
		Scanner scanner = new Scanner(System.in);
		boolean encontrado=false;
		System.out.println("Ingrese Codigo de DESTINO TURISTICO");
		String codigo=scanner.next();

		for(int i=0;i<destino.size() && encontrado==false;i++) {
			if(destino.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				encontrado=true;
				String nuevoPais;
				System.out.println("Ingrese el nuevo Nombre");
				nuevoPais=scanner.next();
				destino.get(i).setNombrePais(nuevoPais);
				System.out.println("Nombre cambiado con exito");
			}
		}
		if(encontrado==false) {
			System.out.println("codigo Incorrecto");
		}
	}
	
	//fin Modificar Pais
	
	// 4 - limpiar array
	
	public static void limpiarDestino(List<DestinoTuristico> destino) {
		destino.clear();
	}
	
	//fin limpiar
	
	
	// 5 - Eliminar
	
	public static void eliminarDestino(List<DestinoTuristico> destino) {
		Iterator<DestinoTuristico> iterador = destino.iterator();
		Scanner scanner = new Scanner(System.in);
		String codigo;
		boolean encontrado=false;
		System.out.println("Ingrese el Codigo de Destino Turistico a Eliminar");
		codigo=scanner.next();
		
		while(iterador.hasNext() && encontrado==false) {
			DestinoTuristico desti = iterador.next();
			if(desti.getCodigo().equalsIgnoreCase(codigo) && encontrado==false) {
				iterador.remove();
				encontrado=true;
			}
			if(encontrado==false) {
				System.out.println("Destino no encontrado");
			}
		}
		
	}
	
	//Fin eliminar
	
	// 6 - ordenar
	public static void ordenarDestino(List<DestinoTuristico> destino) {
		Collections.sort(destino,Comparator.comparing(DestinoTuristico::getNombre));
		mostrarDestinoTuristico(destino);	
	}
	//fin ordenar
	
	// 8 - mostrardestinospais
	
	public static void mostrarDestinoPais(List<DestinoTuristico> destino) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese Codigo de Pais");
		String codigo=scanner.next();
		boolean encontrado=false;
		
		for(int i=0;i<destino.size();i++) {
			if(destino.get(i).getCodigoPais().equalsIgnoreCase(codigo)) {
				System.out.println("----------------");
				System.out.println(destino.get(i).toString());
				System.out.println("----------------");
				encontrado=true;
			}
		}
		if(encontrado==false) {
			System.out.println("Codigo invalido");
		}

	}
	
	
}
