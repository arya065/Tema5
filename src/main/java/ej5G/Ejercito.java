package ej5G;

import ej5F.*;
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

    public void mostrarEjercito() {
        Iterator<Soldado> iterator1 = ejercito.iterator();
        Soldado tmp = new Soldado();
        while (iterator1.hasNext()) {
            tmp = iterator1.next();
            System.out.println(tmp);
        }
    }

    @Override
    public String toString() {
        return "Ejercito{" + "ejercito=" + ejercito + '}';
    }

}
