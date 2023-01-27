package ej5F;

import java.util.*;

public class Ejercito {

    private HashSet<Soldado> ejercito;

    public Ejercito() {
        this.ejercito = new HashSet<Soldado>();
    }

    public int numSoldados() {
        return ejercito.size();
    }

    public void anadirSoldado(Soldado tmp) {
        ejercito.add(tmp);
    }

    public boolean siHayAlquein() {
        return ejercito.isEmpty();
    }

    public boolean siHaySoldado(Soldado tmp) {
        if (ejercito.contains(tmp)) {
            return true;
        } else {
            System.out.println("Si hay este soldado");
            return false;
        }
    }

    public void dematriculacionSoldado(Soldado tmp) {
        ejercito.remove(tmp);
    }

    public HashSet<Soldado> getEjercito() {
        return ejercito;
    }

}
