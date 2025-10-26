package Ej1;

public class Gato extends Animal implements Emisor_de_Sonido{

	Gato(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	public void emiteSonido() {
		System.out.println("Miau");
	}
}
