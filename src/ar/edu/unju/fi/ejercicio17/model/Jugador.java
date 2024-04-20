package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private String nacionalidad;
	private Double estatura;
	private Double peso;
	private String posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	public int calcularEdad() {
		int edad;
		LocalDate hoy = LocalDate.now();
		edad=Period.between(getFechaNac(), hoy).getYears();
		return edad;
	}

	@Override
	public String toString() {
		return "Jugador \nNombre: " + nombre + "\nApellido: " + apellido + "\nFecha de Nacimiento: " + fechaNac+"\nEdad: "+ calcularEdad() + "\nNacionalidad: "
				+ nacionalidad + "\nEstatura: " + estatura +" cm"+ "\nPeso: " + peso +" kg"+ "\nPosicion: " + posicion;
	}
	
	
	
}