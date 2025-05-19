package paquete;

public class prueba {
	  public static void main(String[] args) {
		  Persona p1 = new Persona("mateo");
		  Persona p2 = new Persona("mateo", 17);
		  Persona p3 = new Persona("mateo", 17, "mateo@gmail.com");
		  
		  int letra_p1 = p1.repeticionesDeLetra('a');
		  int letra_p2 = p2.repeticionesDeLetra('a');
		  int letra_p3 = p3.repeticionesDeLetra('a');
		  
		  System.out.println(p1.toString() + "La cantida de letras son: " + letra_p1);
		  System.out.println(p2.toString() + "La cantida de letras son: " + letra_p2);
		  System.out.println(p3.toString() + "La cantida de letras son: " + letra_p3);
	  }
}
