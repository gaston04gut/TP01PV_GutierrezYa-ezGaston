package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	final double salarioMin = 210000;
	final double aumentoMeritos = 20000;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	private void asignarSalario(double salario) {
		if(salario >= salarioMin) {
			this.salario = salario;
		}else {
			this.salario = salarioMin;
		}
	}
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		asignarSalario(salario);	
	}
	
	
	
	

	@Override
	public String toString() {
		return "Nombre del empleado: " + nombre + "\nLegajo: " + legajo + "\nSalario: $" + salario;
	}
	
	public void mostrarEmpleado(Empleado empleado) {
		System.out.println(empleado.toString());
	}
	
	
	public  void aumentarSalario(Empleado empleado) {
		empleado.salario=empleado.salario + aumentoMeritos;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
