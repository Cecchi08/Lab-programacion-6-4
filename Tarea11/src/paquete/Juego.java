package paquete;
import java.util.ArrayList;
import java.util.Iterator;

public class Juego {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public void AgregarJugador(Jugador j) {
		this.jugadores.add(j);
	}
	
	public void EliminarJugador(Jugador j) {
		this.jugadores.remove(j);
	}
	
	public Jugador enfrentar(Jugador j1, Jugador j2, String atributo) {
		Jugador resultado = null;
		
		if (atributo.equalsIgnoreCase("Altura")) {
			resultado = j1.compararJugadoresAltura(j2);
		} else if (atributo.equalsIgnoreCase("Peso")) {
			resultado = j1.compararJugadoresPeso(j2);
		} else if (atributo.equalsIgnoreCase("Velocidad")) {
			resultado = j1.compararJugadoresVelocidad(j2);
		} else if (atributo.equalsIgnoreCase("Fuerza")) {
			resultado = j1.compararJugadoresFuerza(j2);
		} else if (atributo.equalsIgnoreCase("Defensa")) {
			resultado = j1.compararJugadoresDefensa(j2);
		} else if (atributo.equalsIgnoreCase("Ataque")) {
			resultado = j1.compararJugadoresAtaque(j2);
		}
		return resultado;
	}

	public Iterator<Jugador> getjugadores() {
		return this.jugadores.iterator();
	}
}
