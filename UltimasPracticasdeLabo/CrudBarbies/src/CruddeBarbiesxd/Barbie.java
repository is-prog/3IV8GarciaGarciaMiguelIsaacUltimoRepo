package CruddeBarbiesxd;

//Es la clase abstracta porque es la que es capaz de transformarse en las demas
//
//Vamos a poder guardar un registro de CruddeBarbiesxd

import java.io.Serializable;

//nos sirve para poder generar archivos desde binario

public abstract class Barbie implements Serializable {

	private String nombre;
	private int edad;

	public Barbie() {
	}

	public Barbie(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// metodo que sea capaz de poder transformar a barbie de acuerdo a lo que se
	// necesite

	abstract String tipobarbie();
}
