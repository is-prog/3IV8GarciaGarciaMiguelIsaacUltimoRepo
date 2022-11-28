package CruddeBarbiesxd;

public class Maestra extends Barbie {

	private String Materia;
	private String Escuela;

	public Maestra() {

	}

	public Maestra(String Materia, String Escuela) {
		this.Materia = Materia;
		this.Escuela = Escuela;
	}

	public Maestra(String Materia, String Escuela, String nombre, int edad) {
		super(nombre, edad);
		this.Materia = Materia;
		this.Escuela = Escuela;
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String Materia) {
		this.Materia = Materia;
	}

	public String getEscuela() {
		return Escuela;
	}

	public void setEscuela(String Escuela) {
		this.Escuela = Escuela;
	}

	@Override
	String tipobarbie() {
		return ("Maestra");
	}

}
