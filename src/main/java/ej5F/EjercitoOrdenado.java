package ej5F;

import java.util.*;

public class EjercitoOrdenado {

    TreeSet<Soldado> ejercitoOrdenado;

    public EjercitoOrdenado() {
        this.ejercitoOrdenado = new TreeSet<>();
    }

    public int numSoldados() {
        return ejercitoOrdenado.size();
    }

    public void anadirSoldado(Soldado tmp) {
        ejercitoOrdenado.add(tmp);
    }

    public boolean siHayAlquein() {
        return ejercitoOrdenado.isEmpty();
    }

    public boolean siHaySoldado(Soldado tmp) {
        if (ejercitoOrdenado.contains(tmp)) {
            return true;
        } else {
            System.out.println("Si hay este soldado");
            return false;
        }
    }

    public void dematriculacionSoldado(Soldado tmp) {
        ejercitoOrdenado.remove(tmp);
    }

    public TreeSet<Soldado> getEjercito() {
        return ejercitoOrdenado;
    }
}
