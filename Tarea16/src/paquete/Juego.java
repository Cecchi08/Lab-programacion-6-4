package paquete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {
    private List<Unidad> unidades;

    public Juego() {
        unidades = new ArrayList<>();
    }

    public void agregarUnidad(Unidad u) {
        unidades.add(u);
    }

    public void ordenarUnidades() {
        Collections.sort(unidades);
    }

    public void mostrarUnidades() {
        for (Unidad u : unidades) {
            System.out.println(u.getEquipo() + " - " + u.getNombre());
        }
    }
}
