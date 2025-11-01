package paquete;

public abstract class Edificio extends Unidad{
	private int energiaInicial;
	private double tiempoConstruccion;
	private double danoProducido;
	private double danoRecibido;
	
	public Edificio(String equipo, int costo, int energia, int energiaInicial, double tiempoConstruccion, double danoRecibido) {
		super(equipo, costo, energia);
		this.energiaInicial = energiaInicial;
		this.tiempoConstruccion = tiempoConstruccion;
		this.danoRecibido = danoRecibido;
	}


	void recibeDano(int cantidad) {
		cantidad *= this.danoRecibido;
		int energia = this.getEnergia() - cantidad;
		this.setEnergia(energia);
	}

}
