package paquete;
import java.util.ArrayList;
import java.util.Iterator;

public class Juego {
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
	
	public void AgregarPersonaje(Personaje p) {
		this.personajes.add(p);
	}
	
	public void EliminarPersonaje(Personaje p) {
		this.personajes.remove(p);
	}
	
	public boolean Atacar(Personaje p1, Personaje p2) {
		boolean flag = false;
		if (p1.atacar(p2, p1.getAlcance())) {
			p2.recibeDanio(p1.getDanio());
			flag = true;
		}
		return flag;
	}
	public void MoverPersonaje(double X, double Y, Personaje p) {
		p.setXY(X, Y);
	}

	public Iterator<Personaje> getpersonajes() {
		return this.personajes.iterator();
	}
}
