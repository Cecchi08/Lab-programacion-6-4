package paquete;

public class Jugador {
	private String nombre;
	private double altura;
	private double peso;
	private double velocidad;
	private double fuerza;
	private double defensa;
	private double ataque;
	
	public Jugador(String nombre, double altura, double peso, double velocidad, double fuerza, double defensa, double ataque) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.defensa = defensa;
		this.ataque = ataque;
	}
	public String getNombre() {
		return nombre;
	}
	public double getAltura() {
		return altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public double getFuerza() {
		return fuerza;
	}
	public double getDefensa() {
		return defensa;
	}
	public double getAtaque() {
		return ataque;
	}
	
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", altura=" + altura +  ", peso=" + peso + ", velocidad="
				+ velocidad + ", fuerza=" + fuerza + ", defensa=" + defensa + ", ataque=" + ataque + "]";
	}
	
	public Jugador compararJugadoresAltura(Jugador j) {
		Jugador mayor = null;
		if (this.altura > j.getAltura()) {
			mayor = this;
		} else if (this.altura < j.getAltura()) {
			mayor = j;
		}
		return mayor;
	}
	
	public Jugador compararJugadoresPeso(Jugador j) {
		Jugador mayor = null;
		if (this.peso > j.getPeso()) {
			mayor = this;
		} else if (this.peso < j.getPeso()) {
			mayor = j;
		}
		return mayor;
	}
	
	public Jugador compararJugadoresVelocidad(Jugador j) {
		Jugador mayor = null;
		if (this.velocidad > j.getVelocidad()) {
			mayor = this;
		} else if (this.velocidad < j.getVelocidad()) {
			mayor = j;
		}
		return mayor;
	}
	
	public Jugador compararJugadoresFuerza(Jugador j) {
		Jugador mayor = null;
		if (this.fuerza > j.getFuerza()) {
			mayor = this;
		} else if (this.fuerza < j.getFuerza()) {
			mayor = j;
		}
		return mayor;
	}
	
	public Jugador compararJugadoresDefensa(Jugador j) {
		Jugador mayor = null;
		if (this.defensa > j.getDefensa()) {
			mayor = this;
		} else if (this.defensa < j.getDefensa()) {
			mayor = j;
		}
		return mayor;
	}
	
	public Jugador compararJugadoresAtaque(Jugador j) {
		Jugador mayor = null;
		if (this.ataque > j.getAtaque()) {
			mayor = this;
		} else if (this.ataque < j.getAtaque()) {
			mayor = j;
		}
		return mayor;
	}
}
