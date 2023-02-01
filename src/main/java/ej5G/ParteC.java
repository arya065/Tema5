package ej5G;

import java.util.*;
import ej5F.Ejercito;

public class ParteC {

    HashMap<String, Ejercito> listEjercitos;

    public ParteC() {
        this.listEjercitos = new HashMap<>();
    }

    public void anadirEjercito(Ejercito tmp) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce indentificador unico");
        String id = in.nextLine();
        listEjercitos.put(id, tmp);
    }

    public Ejercito getEjercito() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce identificador de ejercito");
        String nom = in.nextLine();
        return listEjercitos.get(nom);
    }

    public Collection<Ejercito> getAll() {
        return listEjercitos.values();
    }

    @Override
    public String toString() {
        return "ParteC{" + "listEjercitos=" + listEjercitos + '}';
    }

    public static void main(String[] args) {
        ParteC test = new ParteC();
        Ejercito tmp1 = new Ejercito();
        Ejercito tmp2 = new Ejercito();
        Ejercito tmp3 = new Ejercito();
        Ejercito tmp4 = new Ejercito();
        test.anadirEjercito(tmp1);
        test.anadirEjercito(tmp2);
        test.anadirEjercito(tmp3);
        test.anadirEjercito(tmp4);
        System.out.println(test.toString());
        
        
        System.out.println(test.getEjercito().toString());
        
        
        System.out.println(test.getAll());
    }
}
