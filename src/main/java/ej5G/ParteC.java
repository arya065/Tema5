package ej5G;

import java.util.*;

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
        //crear ejercito 1 y soldados
        Ejercito tmp1 = new Ejercito();
        Soldado sol11 = new Soldado("a", "1", "1", "1", 1);
        Soldado sol12 = new Soldado("b", "2", "2", "2", 2);
        Soldado sol13 = new Soldado("c", "3", "3", "3", 3);
        tmp1.anadirSoldado(sol11);
        tmp1.anadirSoldado(sol12);
        tmp1.anadirSoldado(sol13);
        //crear ejercito 2 y soldados
        Ejercito tmp2 = new Ejercito();
        Soldado sol21 = new Soldado("d", "11", "11", "11", 11);
        Soldado sol22 = new Soldado("e", "22", "22", "22", 22);
        Soldado sol23 = new Soldado("f", "33", "33", "33", 33);
        tmp2.anadirSoldado(sol21);
        tmp2.anadirSoldado(sol22);
        tmp2.anadirSoldado(sol23);
        //crear ejercito 3 y soldados
        Ejercito tmp3 = new Ejercito();
        Soldado sol31 = new Soldado("g", "111", "111", "111", 111);
        Soldado sol32 = new Soldado("h", "222", "222", "222", 222);
        Soldado sol33 = new Soldado("i", "3", "333", "333", 333);
        tmp3.anadirSoldado(sol31);
        tmp3.anadirSoldado(sol32);
        tmp3.anadirSoldado(sol33);

        test.anadirEjercito(tmp1);
        test.anadirEjercito(tmp2);
        test.anadirEjercito(tmp3);
        
        //metodos
        System.out.println(test.toString());
        System.out.println("---------------------------");
        test.getEjercito().mostrarEjercito();
        System.out.println("---------------------------");
        System.out.println(test.getAll());
    }
}
