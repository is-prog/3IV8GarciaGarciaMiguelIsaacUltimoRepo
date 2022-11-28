package CruddeBarbiesxd;

public class Programadora extends Barbie {

	private String fullstack;
	private String lentes;

	public Programadora() {
	}

	public Programadora(String fullstack, String lentes) {
		this.fullstack = fullstack;
		this.lentes = lentes;
	}

	public Programadora(String fullstack, String lentes, String nombre, int edad) {
		super(nombre, edad);
		this.fullstack = fullstack;
		this.lentes = lentes;
	}

	public String getFullstack() {
		return fullstack;
	}

	public void setFullstack(String fullstack) {
		this.fullstack = fullstack;
	}

	public String getLentes() {
		return lentes;
	}

	public void setLentes(String lentes) {
		this.lentes = lentes;
	}

	@Override
	String tipobarbie() {
		return ("Programadora");
	}
}
