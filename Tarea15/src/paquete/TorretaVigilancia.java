package paquete;

public class TorretaVigilancia extends Edificio implements IHostil{

	private int danoProducido;
	public TorretaVigilancia(String equipo, int costo, int energia, int energiaInicial, double tiempoConstruccion,
			double danoRecibido, int danoProducido) {
		super(equipo, 200, energia, 2000, 40, 1);
	}
	@Override
	public void atacar(Unidad adversario) {
		adversario.recibeDano(this.danoProducido);
	}
	@Override
	void recibeDano(double danoProducido) {
		// TODO Auto-generated method stub
		
	}
	
}
