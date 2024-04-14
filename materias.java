package ejercicoUtn;

import java.util.List;

public class materias extends inscripcion {

	private String Nombre;
	private List<String>correlativas;
	
	public materias(String nombre, List<String> correlativas) {
		this.Nombre = nombre;
		this.correlativas = correlativas;
	}
	public materias(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public List<String> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(List<String> correlativas) {
		this.correlativas = correlativas;
	}
	
	
	
}
