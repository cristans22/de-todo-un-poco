package poo;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      empleados trabajador1= new empleados("cristian");
      empleados trabajador2= new empleados("florencia");
      empleados trabajador3= new empleados("cristian");
      empleados trabajador5= new empleados("cristian");
     trabajador1.cambiaSeccion("rrhh");
      System.out.println (trabajador1.devuelveDtos());
      System.out.println(trabajador2.devuelveDtos());
      System.out.println(trabajador3.devuelveDtos());
      System.out.println(trabajador5.devuelveDtos());
	System.out.println(empleados.dameIdSiguiente());
	}

}

 class empleados{     	
	
	 public empleados (String nom) {
		 
		 nombre = nom;
		 seccion="administracion";
		 id=idSiguiente;
		 idSiguiente++;
	
	 }
	  public void cambiaSeccion (String seccion) {
		  this.seccion=seccion;
	  }
	  public String devuelveDtos() {
		  return "el nombre es: " + nombre + " corresponde a la seccion :"+seccion + "el id= " + id; 
	  }
	  public void cambiaNombre(String nombre) {
		  this.nombre=nombre;
	  
	  }
	   public static String dameIdSiguiente() {
		   
		   return  "el id siguiente es: " + idSiguiente;
	   }
	  
	 
	private String nombre;
	
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
}