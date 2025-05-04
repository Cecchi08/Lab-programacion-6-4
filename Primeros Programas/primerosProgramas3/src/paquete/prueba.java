package paquete;

public class prueba {
	public static void main(String[] args) {
		Guerrero guerrero1 = new Guerrero();
		
		guerrero1.mover(2, 3);
		guerrero1.recibeDano(40);
		System.out.println(
				 "Hola " + guerrero1.getNombre() +
			     ", tu vitalidad es " + guerrero1.getVitalidad() +
			     ", tu armadura es " + guerrero1.getArmadura() +
			     ", x es " + guerrero1.getX() +
			     " y es " + guerrero1.getY()
				);
		
		Guerrero guerrero2 = new Guerrero();
		guerrero2.setNombre("Mateo");
		guerrero2.setArmadura(30);
		guerrero2.setVitalidad(100);
		guerrero2.setX(3);
		guerrero2.setY(6);
		guerrero2.mover(2, 3);
		guerrero2.recibeDano(40);
		
		System.out.println(
				 "Hola " + guerrero2.getNombre() +
			     ", tu vitalidad es " + guerrero2.getVitalidad() +
			     ", tu armadura es " + guerrero2.getArmadura() +
			     ", x es " + guerrero2.getX() +
			     " y es " + guerrero2.getY()
				);
	}
}
