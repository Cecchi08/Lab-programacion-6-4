package paquete;

public class Mago extends Personaje {
	protected int cantidadMagia;

	public Mago(String nombre, String tipo, double X, double Y) {
		super(nombre, 300, tipo, X, Y, 100, 10);
		this.cantidadMagia = 5000;
	}

	public void recuperarMagia(int cantidad) {
		this.cantidadMagia += cantidad;
	}
	
	public void telentransportar(double valorX, double valorY) {
		if (cantidadMagia > 2000) {
			this.x = valorX;
			this.y = valorY;
			cantidadMagia -= 2000;
		}
	}

	public void curar(int cantidad, Personaje curado) {
		if (cantidadMagia > 1000) {
			curado.vitalidad += 100;
			cantidadMagia -= 1000;
			
		}
	}
}
