package paquete;

public class prueba {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		System.out.println("Hola " + persona1.getNombre() + " , tu edad es " + persona1.getEdad() + " y tu Gmail es " + persona1.getGmail());
		Persona persona2 = new Persona();
		persona2.setNombre("Mateo");
		persona2.setEdad(25);
		persona2.setGmail("holamundo@gmail.com");

		System.out.println("Hola " + persona2.getNombre() + ", tu edad es " + persona2.getEdad() + " y tu Gmail es " + persona2.getGmail());

	}
}
