package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico extends Pais {
	private String codigo;
	private String nombre;
	private Double precio;
	private int cantDias;
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DestinoTuristico(String codigo, String nombre, Double precio, int cantDias) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantDias = cantDias;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	@Override
	public String toString() {
		return "Destino Turistico \nCodigo: " + codigo + "\nNombre: " + nombre + "\nPrecio: " + precio +
				"\nPais: "+getNombrePais()+"\nCantidad de Dias: "+ cantDias;
	}

	

	
}
