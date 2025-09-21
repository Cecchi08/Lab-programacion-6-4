package paquete;

public abstract  class Personaje {
	protected String nombre;
	protected int vitalidad;
	protected double x;
	protected double y;
	protected String tipo;
	protected int alcance;
	protected int danio;

	public Personaje(String nombre, int vitalidad, String tipo, double x, double y, int alcance, int danio) {
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.tipo = tipo;
		this.x = x;
		this.y = y;
		this.alcance = alcance;
		this.danio = danio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getVitalidad() {
		return this.vitalidad;
	}

	public double getPosX() {
		return this.x;
	}

	public double getPosY() {
		return this.y;
	}
	public String getTipo() {
		return this.tipo;
	}

	
	public int getAlcance() {
		return alcance;
	}

	public int getDanio() {
		return danio;
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void incrementaPos(double valorX, double valorY) {
		this.x += valorX;
		this.y += valorY;
	}
	public double distancia(double valorReferencia) {
		double miMagnitud = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
		return Math.abs(miMagnitud - valorReferencia);
	}

	public void recibeDanio(int cantidad) {
		this.vitalidad = Math.max(0, this.vitalidad - cantidad);
	}

	public boolean atacar(Personaje adversario, int alcanceAtaque) {
		double posicionX = adversario.getPosX();
		double posicionY = adversario.getPosY();
		double magnitudAdversario = Math.sqrt(Math.pow(posicionX, 2) + Math.pow(posicionY, 2));
		double distanciaEntrePersonajes = this.distancia(magnitudAdversario);
		return distanciaEntrePersonajes <= alcanceAtaque;
	}
	   
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vitalidad=" + vitalidad + ", x=" + x + ", y=" + y + "]";
	}
	
}
