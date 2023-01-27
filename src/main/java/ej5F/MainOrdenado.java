package ej5F;

import java.util.*;

public class MainOrdenado {
    
    public static void main(String[] args) {
        EjercitoOrdenado ejercitoOrdenado = new EjercitoOrdenado();
        Soldado sol1 = new Soldado("A1", "sol1", "sol1", "sol1", 10);
        Soldado sol2 = new Soldado("1", "sol2", "sol2", "sol2", 11);
//        Comparator<Soldado> comparatorName = (p1, p2) -> p1.getNif().compareToIgnoreCase(p2.getNif());
        
        ejercitoOrdenado.anadirSoldado(sol1);
        ejercitoOrdenado.anadirSoldado(sol2);
        ejercitoOrdenado.anadirSoldado(sol2);
        
        imprimir(ejercitoOrdenado.getEjercito());
        
        System.out.print("Numero de soldados -- ");
        System.out.println(ejercitoOrdenado.numSoldados());
        
        System.out.print("Ejercito esta vacio -- ");
        System.out.println(ejercitoOrdenado.siHayAlquein());
        
        System.out.print("Hay soldado sol1 -- ");
        System.out.println(ejercitoOrdenado.siHaySoldado(sol1));
        
        System.out.print("Hay soldado sol2 -- ");
        System.out.println(ejercitoOrdenado.siHaySoldado(sol2));
        
        ejercitoOrdenado.dematriculacionSoldado(sol1);
        imprimir(ejercitoOrdenado.getEjercito());
    }
    
    public static void imprimir(TreeSet<Soldado> tmp) {
        tmp.forEach(System.out::println);
    }
}
