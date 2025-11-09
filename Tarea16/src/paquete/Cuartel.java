package paquete;

public class Cuartel extends Edificio implements IConstruible{

	public Cuartel(String equipo, int costo, int energia, int energiaInicial, double tiempoConstruccion,
			double danoRecibido) {
		super(equipo, 500, energia, 3000, 60, 0.5);
	}

	@Override
	public int getTiempoConstruccion() {
		return this.getTiempoConstruccion();
	}

	@Override
	void recibeDano(double danoProducido) {
		// TODO Auto-generated method stub
		
	}
	
}
