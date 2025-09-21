package paquete;

public class Arquero extends Personaje {
	protected int cantidadFlechas;

	public Arquero(String nombre, String tipo, double x, double y) {
	    super(nombre, 400, tipo, x, y, 100, 20); 
	    this.cantidadFlechas = 20;
	}
}
