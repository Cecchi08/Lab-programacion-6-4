package Ej1;

public class Perro extends Animal implements Emisor_de_Sonido{

	Perro(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	public void emiteSonido() {
		System.out.println("Guau");
	}
}
