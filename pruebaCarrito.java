package poo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.net.ssl.ExtendedSSLSession;

public class pruebaCarrito extends carritoCompras {

	public pruebaCarrito(ArrayList<String> producto, int cantidad, int precioU) {
		super(producto, cantidad, precioU);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList carrito1 = new ArrayList() ;
     String[] producto = new String[10];
     System.out.println("ingrese su producto");
     Scanner entrada = new Scanner(System.in);
     producto[1]=entrada.next() ;
     System.out.println(carrito1.add(producto));
     carrito1.hashCode();
     
     
    
	}
	}


