package paquete;

abstract class Personaje extends Unidad{
	private int energiaInicial;
	private double danoRecibido;
	protected double danoProducido;
	
	public Personaje(String equipo, int costo, int energia, int energiaInicial, double danoRecibido, double d) {
		super(equipo, equipo, costo, energia);
		this.energiaInicial = energiaInicial;
		this.danoRecibido = danoRecibido;
		this.danoProducido = d;
	}

	void recibeDano(int cantidad) {
		cantidad *= this.danoRecibido;
		int energia = this.getEnergia() - cantidad;
		this.setEnergia(energia);
	}

	@Override
	void recibeDano(double danoProducido) {
		// TODO Auto-generated method stub
		
	}

}
