
package poo;
import java.util.*;
import java.util.concurrent.Callable;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       empleado[] misEmpleados = new empleado[3];
      
       
       misEmpleados[0] = new empleado("cristian",10000,1990,07,1);
       misEmpleados[1] = new empleado("javier",5000,1992,01,3);
       misEmpleados[2] = new empleado("hernan",8000,1991,05,4);
      
     empleado director_comercial = new empleado("cristian",364643,2020,03,45);
     Comparable ejemplo = empleado("damnian",764633,1998,12,29);
     if (director_comercial  instanceof empleado) {
    	 System.out.println("es de tipo jefatura");
		
	}	
     if (ejemplo instanceof Comparable) {
		System.out.println("implementa la interfaz comparable");
	}
     
	
       
       
       for(empleado e: misEmpleados) {
    	   e.subeSueldo(10);
       }
       
       Arrays.sort(misEmpleados);
       
       
       for(empleado e:misEmpleados) {
    	   System.out.println("nombre " + e.dameNombre()+
    			   " sueldo " + e.dameSueldo()+
    			   " fecha de alta "
    			   + e.dameAltaDeContrato());
    	 
       }
	}

	private static Comparable empleado(String string, int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}}

class empleado implements Comparable{
	
	public empleado(String nom, double sue,int año ,int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar  calendario = new GregorianCalendar(año,mes -1,dia);
		AltaContrato=calendario.getTime();
	}
	
	public empleado(String nom) {
		nombre=nom;
	}
	
			
			public String dameNombre() {
				return nombre;
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
	       
	public int compareTo(Object miObjeto) {
		empleado otroempleado =(empleado) miObjeto;
		if (this.sueldo < otroempleado.sueldo) {
			return -1;
		}if (this.sueldo >otroempleado.sueldo) {
			return 1;
		}
		return 0;
	}
	private String nombre;
	private double sueldo;
	private Date AltaContrato;
}

	

