package ejercicoUtn;

import java.util.List;

public class alumno extends inscripcion {
	 private String nombre ;
	 private int legajo;
	 private List<String> materiasAprobadas;
	public alumno(String nombre, int legajo, List<String> materiasAprobadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.materiasAprobadas = materiasAprobadas;
	}
	public alumno(String nombre2, int legajo2, String string) {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public List<String> getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(List<String> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
	
	 
	 

}
