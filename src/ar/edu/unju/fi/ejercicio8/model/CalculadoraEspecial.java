package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private long n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public CalculadoraEspecial(long n) {
		this.n = n;
	}

	public long getN() {
		return n;
	}

	public void setN(long n) {
		this.n = n;
	}
	
	public long calcularSumatoria(long n) {
		long k;
		long suma=0;
		long result;
		for(k=1; k<=n ; k++){
			result=(k * (k + 1)) / 2;
			result=result*result;
			suma=suma+result;
		}
		return suma;
	}
	public long calcularProductoria(long n) {
		long k;
		long product=1;
		long result;
		for(k=1; k<=n ; k++){
			result=(k * (k + 4));	
			product=product*result;
		}
		return product;
	}
}