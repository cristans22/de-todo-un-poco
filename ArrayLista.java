package poo;
import java.util.List;
import java.util.ArrayList;

public class ArrayLista<ItemCarrito> {
	
	
	private List<ItemCarrito> items;
	public ArrayLista() {
	this.items = new
	ArrayList<ItemCarrito>();
	}
	public void agregarItem(ItemCarrito ic) {
	this.items.add(ic);
	}
	public void quitarItem(ItemCarrito ic) {
	this.items.remove(ic);
	}
	public List<ItemCarrito> getItems() {
	return items;
	}



public class pruebaArrayList extends ArrayLista<ItemCarrito> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	}
}
