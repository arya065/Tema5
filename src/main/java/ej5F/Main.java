package ej5F;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Ejercito ejercito = new Ejercito();
        Soldado sol1 = new Soldado("asdfg", "sol1", "sol1", "sol1", 10);
        Soldado sol2 = new Soldado("asdf", "sol2", "sol2", "sol2", 11);

        ejercito.anadirSoldado(sol1);
        ejercito.anadirSoldado(sol2);
        ejercito.anadirSoldado(sol2);
        imprimir(ejercito.getEjercito());

        System.out.print("Numero de soldados -- ");
        System.out.println(ejercito.numSoldados());

        System.out.print("Ejercito esta vacio -- ");
        System.out.println(ejercito.siHayAlquein());

        System.out.print("Hay soldado sol1 -- ");
        System.out.println(ejercito.siHaySoldado(sol1));

        System.out.print("Hay soldado sol2 -- ");
        System.out.println(ejercito.siHaySoldado(sol2));

        ejercito.dematriculacionSoldado(sol1);
        imprimir(ejercito.getEjercito());
        System.out.println("\n\n\n\n\n\n\n");

        ejercito.mostrarEjercito();

    }

    public static void imprimir(HashSet<Soldado> tmp) {
        tmp.forEach(System.out::println);
    }
}
