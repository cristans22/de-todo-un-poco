

import java.util.Date;
import java.util.GregorianCalendar;


public class persona {
	
	public static void  main (String[] args) {
		Persona[] lasPersonas= new Persona[2];
		lasPersonas[0] = new profesor("cristian suares",50000,1990,03,31);
		lasPersonas[1] = new alumno("florecia baigorria ", "biologia");
		
		for(Persona p : lasPersonas) {
			System.out.println(p.dameNombre()+ "," +p.dameDescripcion());
		}}
		
	
}

abstract class Persona{
	public  Persona(String nom) {
		nombre = nom;
	}
	
	

	public String dameNombre() {
		 return nombre;
	}
	
	public abstract String dameDescripcion();
	
	
	private String nombre ;
	
	
}


class profesor extends Persona {
	
	public profesor( String nom,double sue,int año ,int mes, int dia) {
		super(nom);
		sueldo=sue;
		GregorianCalendar  calendario = new GregorianCalendar(año,mes -1,dia);
		AltaContrato=calendario.getTime();
		
	}
	
	    public String dameDescripcion () {
	    	return "este empleado tiene un sueldo " + sueldo;
	    }
	   
		public double dameSueldo() {
			return sueldo;
		}
		public Date dameAltaDeContrato() {
			return AltaContrato;
		}
       public void subeSueldo(double porsentaje) {
		 double aumento = sueldo*porsentaje/100;
		  sueldo+=aumento;
       }

private double sueldo;
private Date AltaContrato;
	
}
 class alumno extends Persona{
	
	
	public alumno (String nom,String car) {
		super(nom);
		 carrera=car;
	}
	
	
	public String dameDescripcion() {
		return " este alumno pertenece a la carrera" + carrera;
	}
	
	private String carrera ;
}