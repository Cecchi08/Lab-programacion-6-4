package paquete;

public class prueba {
	public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaUniversitaria("Mateo");
		c1.deposito(700);
		System.out.println(c1);
		c1.extraer(300);
		System.out.println(c1);
		c1.extraer(300);
		System.out.println(c1);
		c1.extraer(700);
		System.out.println(c1);
		
		
		CuentaBancaria c2 = new CuentaCorriente("Lautaro");
		System.out.println(c2);
		c2.extraer(300);
		System.out.println(c2);
		c2.extraer(300);
		System.out.println(c2);
		c2.extraer(700);
		System.out.println(c2);
		
		CuentaBancaria c3 = new CajaDeAhorro("Elisa");
		System.out.println(c3);
		c3.extraer(300);
		System.out.println(c3);
		c3.extraer(300);
		System.out.println(c3);
		c3.extraer(700);
		System.out.println(c3);
	}
}
