package paquete;

public class prueba {
	public static void main(String[] args) {
		Guerrero g1 = new Guerrero("leo");
		g1.mover(8, 10);
		g1.recibeDano(100);
		System.out.println(g1.toString());
		
		Guerrero g2 = new Guerrero("ari", 55, 6);
		g2.mover(10, 5);
		g2.recibeDano(2);
		System.out.println(g2.toString());
	}
}
