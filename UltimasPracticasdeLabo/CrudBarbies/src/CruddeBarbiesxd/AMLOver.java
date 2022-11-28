package barbies;

public class AMLOver extends Barbie {

	private String Estado;
	private String ocupacion;

	public AMLOver() {

	}

	public AMLOver(String Estado, String ocupacion) {
		this.Estado = Estado;
		this.ocupacion = ocupacion;
	}

	public AMLOver(String Estado, String ocupacion, String nombre, int edad) {
		super(nombre, edad);
		this.Estado = Estado;
		this.ocupacion = ocupacion;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String Estado) {
		this.Estado = Estado;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	@Override
	String tipobarbie() {
		return ("AMLOver");
	}

}
