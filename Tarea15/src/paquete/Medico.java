package paquete;

public class Medico extends Personaje implements IPosicionable, IHostil, IMovible{

	public Medico(String equipo, int costo, int energia, int energiaInicial, double danoRecibido, int danoProducido) {
		super(equipo, 40, energia, 100, 1, 1.5);
	}

	@Override
	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atacar(Unidad adversario) {
		adversario.recibeDano(this.danoProducido);
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

}
