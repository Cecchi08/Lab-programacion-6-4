package Ej1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        animales.add(new Perro("Perro", "Guau"));
        animales.add(new Gato("Gato", "Miau"));
        animales.add(new Vaca("Vaca", "Muu"));
        animales.add(new Pollito("Pollito", "Quuak"));
        
        vehiculos.add(new Ambulancia("123", "1", "4"));
        
        for (Animal a : animales) {
            if (a instanceof Emisor_de_Sonido) {
                ((Emisor_de_Sonido) a).emiteSonido(); 
            }
        }
        
        for (Vehiculo v : vehiculos) {
            if (v instanceof Emisor_de_Sonido) {
                ((Emisor_de_Sonido) v).emiteSonido(); 
            }
        }
    }
}