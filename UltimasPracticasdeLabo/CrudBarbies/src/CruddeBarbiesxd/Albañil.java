package CruddeBarbiesxd;

public class Albañil extends Barbie {

	private String especialidad;
	private int cocastomadas;

	public Albañil() {

	}

	public Albañil(String especialidad, int cocastomadas) {
		this.especialidad = especialidad;
		this.cocastomadas = cocastomadas;
	}

	public Albañil(String especialidad, int cocastomadas, String nombre, int edad) {
		super(nombre, edad);
		this.especialidad = especialidad;
		this.cocastomadas = cocastomadas;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getCocastomadas() {
		return cocastomadas;
	}

	public void setCocastomadas(int cocastomadas) {
		this.cocastomadas = cocastomadas;
	}

	@Override
	String tipobarbie() {
		return ("Albañil");
	}

}
