package paquete;

public class Soldado extends Personaje implements IPosicionable, IHostil, IMovible{

	public Soldado(String equipo, int costo, int energia, int energiaInicial, double danoRecibido, int danoProducido) {
		super(equipo, 100, energia, 500, 1, 1.5);
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
