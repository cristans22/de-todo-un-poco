package poo;

public class coche {
	private int ruedas;
	private int pesoPlataforma;
	private int ancho;
	private int largo;
	private int motor;
	String color;
	int pesoTotal;
	boolean asientoCuero , climatizador;
	
	public coche () {
		
		ruedas =4;
		pesoPlataforma =500;
		ancho=300;
		largo=500;
		motor=1500;
	}
	
	public String dimeDatosGenerales() {
		return " el coche tiene un peso de base " + pesoPlataforma + "contien las cantidad de " + ruedas +
				" marcas fate o  el ancho de la carroseria es de "+ ancho + "y un larfo de " +largo+ "y un motor de "
				+ motor + "cc , muy compacto y potente";
		
	}
	
	public String ruedas() {
		 return "su coche tiene " + ruedas;
	 }
	
 public String dime_largo() {
	 return "su largo es " + largo;
 }
 public String dime_peso() {
	 return "su peso de plataforma es " + pesoPlataforma;}
 
 public String dime_ancho() {
	 return "su ancho es " + ancho;
	 
 }
 
 public void configuraAsiento(String asientoCuero) {
	  if(asientoCuero.equalsIgnoreCase("si")  ) {
		  this.asientoCuero=true;
	  }else { this.asientoCuero=false;
	  }
	  
	  }
 
 public String dimeAsientos() {
	  if (asientoCuero==true) {
		  return "si tiene asietos de cuero";
	  }
	  else return "no contiene asientos de cuero";
 } 
 
 public void configuraClimatizador(String climatizador) {
	  if(climatizador.equalsIgnoreCase("si")) {
		  
		  this.climatizador=true;
	  }else { this.climatizador=false;
	  }
	  
	  }

 public  String dimeClimatizador() {
	 if (climatizador==true) { 
		 return " si contiene climatizador";
	 } else {
		 return "no contiene climatizador";
	 }
	 
 }
  public void estableceColor(String coche_color) {
	  
	  color=coche_color;
  }
  public String dimeColor() {
	  return "el color de coche es " + color;
	  
  }
 
 public int precioCoche() {
	 int precioFinal=10000;
	 
	 if (asientoCuero==true) {
		 precioFinal+=2000;
	 }
	 if (climatizador==true) {
		 precioFinal+=1500;
	 }return  precioFinal;
 }
 
}





