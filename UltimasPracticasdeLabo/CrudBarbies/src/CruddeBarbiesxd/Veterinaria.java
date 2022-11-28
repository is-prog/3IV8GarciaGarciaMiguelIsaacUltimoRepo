package CruddeBarbiesxd;

public class Veterinaria extends Barbie {

	private int cedulaprofesional;
	private String animalito;

	public Veterinaria() {

	}

	public Veterinaria(int cedulaprofesional, String animalito) {
		this.cedulaprofesional = cedulaprofesional;
		this.animalito = animalito;
	}

	public Veterinaria(int cedulaprofesional, String animalito, String nombre, int edad) {
		super(nombre, edad);
		this.cedulaprofesional = cedulaprofesional;
		this.animalito = animalito;
	}

	public int getCedulaprofesional() {
		return cedulaprofesional;
	}

	public void setCedulaprofesional(int cedulaprofesional) {
		this.cedulaprofesional = cedulaprofesional;
	}

	public String getAnimalito() {
		return animalito;
	}

	public void setAnimalito(String animalito) {
		this.animalito = animalito;
	}

	@Override
	String tipobarbie() {
		return ("Veterinaria");
	}

}
