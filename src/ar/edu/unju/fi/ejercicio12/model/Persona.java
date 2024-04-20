package ar.edu.unju.fi.ejercicio12.model;


import java.util.Calendar;


public class Persona {
	
	private String nombre;
	private Calendar fechaDeNacimiento;
	
	
	public Persona(String nombre, Calendar fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public void mostrarDatos(Persona persona) {
		int edad;
		System.out.println("Nombre: "+persona.getNombre());
		fechaCorrecta();
		edad = calcularFechas();
		System.out.println("Edad: "+edad+" años");
		zodiaco();
		estaciones();
		
		
	}
	
	public void fechaCorrecta() {
		int mes;
		mes=fechaDeNacimiento.get(Calendar.MONTH);
		mes++;
		System.out.println("Fecha de Nacimiento: "+fechaDeNacimiento.get(Calendar.DAY_OF_MONTH)+"/"+mes+"/"+fechaDeNacimiento.get(Calendar.YEAR));
	}
	
	public void zodiaco() {
		int dia=fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
		switch(fechaDeNacimiento.get(Calendar.MONTH)) {
		case 0: //enero
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Acuario");
			}else {
				System.out.println("Signo del Zodiaco: Capricornio");
			}
			break;
		case 1: //feb
			if(dia>=20) {
				System.out.println("Signo del Zodiaco: Piscis");
			}else {
				System.out.println("Signo del Zodiaco: Acuario");
			}
			break;
		case 2://marz
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Aries");
			}else {
				System.out.println("Signo del Zodiaco: Piscis");
			}
			break;
		case 3: //abril
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Tauro");
			}else {
				System.out.println("Signo del Zodiaco: Aries");
			}
			break;
		case 4: //mayo
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Geminis");
			}else {
				System.out.println("Signo del Zodiaco: Tauro");
			}
			break;
		case 5://jun
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Cancer");
			}else {
				System.out.println("Signo del Zodiaco: Geminis");
			}
			break;
		case 6: //jul
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Leo");
			}else {
				System.out.println("Signo del Zodiaco: Cancer");
			}
			break;
		case 7: //agos
			if(dia>=22) {
				System.out.println("Signo del Zodiaco: Virgo");
			}else {
				System.out.println("Signo del Zodiaco: Leo");
			}
			break;
		case 8://sep
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Libra");
			}else {
				System.out.println("Signo del Zodiaco: Virgo");
			}
			break;
		case 9: //oct
			if(dia>=21) {
				System.out.println("Signo del Zodiaco: Escorpion");
			}else {
				System.out.println("Signo del Zodiaco: Libra");
			}
			break;
		case 10: //nov			
			if(dia>=22) {
				System.out.println("Signo del Zodiaco: Sagitario");
			}else {
				System.out.println("Signo del Zodiaco: Escorpion");
			}
			break;
		case 11://dic
			if(dia>=22) {
				System.out.println("Signo del Zodiaco: Capricornio");
			}else {
				System.out.println("Signo del Zodiaco: Sagitario");
			}
			break;
		}
	}
	
	public void estaciones() {
		int dia=fechaDeNacimiento.get(Calendar.DAY_OF_YEAR);
		if(dia>=81 && dia<=172){//21 marzo y 20 de junio
			System.out.println("Estacion: Otoño");
		}
		if(dia>=173 && dia<=264) {//21 de junio y 20 de septiembre
			System.out.println("Estacion: Invierno");
		}
		if(dia>=265 && dia<=355) {//21 de sep y 20 de diciembre
			System.out.println("Estacion: Primavera");
		}
		if(dia>=356 || dia<=80) {
			System.out.println("Estacion: Verano");
		}
	}
	
	public int calcularFechas() {
		int edad;
		Calendar fechaHoy = Calendar.getInstance();
		edad = fechaHoy.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR);
		if(fechaHoy.get(Calendar.DAY_OF_YEAR) < fechaDeNacimiento.get(Calendar.DAY_OF_YEAR)) {
			edad--;
		}
		return edad;
	}
	
}
