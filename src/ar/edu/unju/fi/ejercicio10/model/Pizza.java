package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEsp;
	
	final private int esp20=500;
	final private int esp30=750;
	final private int esp40=1000;
	
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}


	public double getDiametro() {
		return diametro;
	}


	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public boolean isIngredientesEsp() {
		return ingredientesEsp;
	}


	public void setIngredientesEsp(boolean ingredientesEsp) {
		this.ingredientesEsp = ingredientesEsp;
	}

	public void calcularPrecio() {
		double precioInicial=0;
		double precioEspecial=0;
		double total;
		switch (diametro) {
		case 20:
			precioInicial=4500;
			if(ingredientesEsp) {
				precioEspecial=esp20;
			}
			break;
		case 30:
			precioInicial=4800;
			if(ingredientesEsp) {
				precioEspecial=esp30;
			}
			break;
		case 40:
			precioInicial=5500;
			if(ingredientesEsp) {
				precioEspecial=esp40;
			}
			break;
		}
		total=precioInicial+precioEspecial;
		precio=total;
	}
	
	
	public void calcularArea(Pizza pizza) {
		double radio;
		radio=((pizza.getDiametro() / 2) * (pizza.getDiametro() / 2));
		area=Math.PI*radio;
	}



	public String toString(int cont) {
		return "--- Pizza "+ cont +"---\n * Diametro: " + diametro + "\n * Ingredientes Especiales: "	+ ingredientesEsp + "\n * Precio Pizza: "	+ precio + "\n * Area de la Pizza: " + area ;

	}
	
	
	
}
