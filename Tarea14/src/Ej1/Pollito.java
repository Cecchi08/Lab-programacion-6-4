package Ej1;

public class Pollito extends Animal implements Emisor_de_Sonido{

	Pollito(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	public void emiteSonido() {
		System.out.println("Quak");
	}

}
