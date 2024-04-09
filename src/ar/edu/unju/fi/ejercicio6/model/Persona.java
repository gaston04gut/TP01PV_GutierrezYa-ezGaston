package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}


	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}



	@Override
	public String toString() {
		return "DNI: " + dni + "\nNombre: " + nombre + "\nFecha De Nacimiento: " + fechaNacimiento + "\nProvincia: " + provincia;
	}

	public int calcularEdad(LocalDate fechaHoy) {
		int edad;
		edad = Period.between(fechaNacimiento, fechaHoy).getYears();
		return edad;
	}

	public boolean mayorDeEdad(LocalDate fechaHoy) {
		boolean mayor;
		int edad=calcularEdad(fechaHoy);
		if (edad>=18) {
			mayor=true;
		}else {
			mayor=false;
		}
		return mayor;
	}
	public static void mostrarDatos (Persona persona, LocalDate fechaHoy) {
		int edad;
		boolean mayor;
		edad = persona.calcularEdad(fechaHoy);
		mayor=persona.mayorDeEdad(fechaHoy);
		System.out.println(persona.toString());
		System.out.println("Edad: "+edad);
		if(mayor==true) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


}

