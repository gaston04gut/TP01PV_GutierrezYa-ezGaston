package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcularDescuento(double precio, int descuento) {
		double nuevoprecio;
		nuevoprecio=precio-descuento;
		return nuevoprecio;
	}
	
	public void mostrarPrecio(Producto prod1) {
		double nuevoprecio;
		System.out.println(prod1.toString());
		nuevoprecio=prod1.calcularDescuento(prod1.getPrecio(), prod1.getDescuento());
		prod1.setPrecio(nuevoprecio);
		System.out.println("");
		System.out.println("Producto con descuento");
		System.out.println("___________________");
		System.out.println(prod1.toString());
		System.out.println("___________________");
	}
	
	@Override
	public String toString() {
		return "Producto: "+"\nNombre: " + nombre + "\nCodigo: " + codigo + "\nPrecio: $" + precio;// + ", descuento=" + descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
}
