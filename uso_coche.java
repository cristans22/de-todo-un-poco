package poo;

public class uso_coche   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coche renault = new coche();
		renault.dimeDatosGenerales();
		System.out.println(renault.dimeDatosGenerales());
		 renault.dime_ancho();
		 System.out.println(renault.dime_ancho());
		 
		 renault.configuraClimatizador("si");
		 System.out.println(renault.dimeClimatizador());
		 renault.estableceColor("rojo");
		 System.out.println(renault.dimeColor());
		
		System.out.println(renault.dime_largo());
       renault.configuraAsiento("si");
        System.out.println(renault.dimeAsientos());
        System.out.println("el precio final del coche es " +renault.precioCoche());
	}
	 	
}
