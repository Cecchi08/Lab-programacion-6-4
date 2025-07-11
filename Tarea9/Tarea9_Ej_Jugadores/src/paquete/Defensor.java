package paquete;

public class Defensor extends Jugador{
	public Defensor(String nombre, double velocidad, double potencia) {
		super(nombre, velocidad, potencia);
	}

	@Override
	public double indiceDefensa() {
		return (this.velocidad * this.velocidad);
	}

	@Override
	public double indiceAtaque() {

		return (this.potencia * this.potencia);
	}

	@Override
	public String toString() {
		return "Defensor [indiceDefensa()=" + indiceDefensa() + ", indiceAtaque()=" + indiceAtaque() + "]";
	}
}
