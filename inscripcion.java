package ejercicoUtn;

import java.util.Date;
import java.util.GregorianCalendar;

public class inscripcion {
	private String materia;
	private String alumno;
	private Date altaIngreso;
	protected boolean aprobada;
	private int año;
	private int mes;
	private int dia;
	
	
	public inscripcion() {
		super();
		this.materia = materia;
		this.alumno = alumno;
		
		
		GregorianCalendar  calendario = new GregorianCalendar(año,mes -1,dia);
		this.altaIngreso = calendario.getGregorianChange();
		this.aprobada = aprobada;
	}
	
	

	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	
	public void setAltaIngreso(Date altaIngreso) {
		// TODO Auto-generated method stub
		this.altaIngreso = altaIngreso;
	}



	public Date getAltaIngreso() {
		return altaIngreso;
	}



	



	public boolean isAprobada() {
		return aprobada;
	}
	public void setAprobada(boolean aprobada) {
		this.aprobada = aprobada;
	}



	public void setAltaIngreso(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}



	



	
}
