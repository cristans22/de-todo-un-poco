package poo;

import java.util.ArrayList;

public class carritoCompras {
 ArrayList<String> producto;
 int cantidad ;
 int precioU;
 int precioTotal;
public carritoCompras(ArrayList<String> producto, int cantidad, int precioU) {
	super();
	this.producto = producto;
	this.cantidad = cantidad;
	this.precioU = precioU;
	this.precioTotal = precioTotal;
}
public carritoCompras(carritoCompras carrito1, int i) {
	// TODO Auto-generated constructor stub
}
public ArrayList<String> getProducto() {
	return producto;
}
public void setProducto(ArrayList<String> producto) {
	this.producto = producto;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public double getPrecioU() {
	return precioU;
}
public void setPrecioU(int precioU) {
	this.precioU = precioU;
}
public double getPrecioTotal() {
	return precioTotal ;
}
public void PrecioTotal() {
	System.out.println(this.precioU * this.cantidad);
}
@Override
public String toString() {
	return "carritoCompras [producto=" + producto + ", cantidad=" + cantidad + ", precioU=" + precioU ;
}
}

