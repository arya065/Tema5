package ej5G;

import java.util.*;

public class Loteria {

    HashMap<Integer, Boolean> loteria;

    public Loteria() {
        this.loteria = new HashMap<>();
        completeLoteria();
    }

    public void completeLoteria() {
        for (int i = 0; i < 1000; i++) {
            int key = randNum();
            if (key % 2 == 0) {
                this.loteria.put(key, true);
            } else {
                this.loteria.put(key, false);
            }
        }
    }

    public boolean winOrLose(int key) {
        try {
            boolean result = loteria.get(key);
            if (result) {
                System.out.println("Has ganado");
                return true;
            } else {
                System.out.println("Ooops...");
                return false;
            }
        } catch (java.lang.NullPointerException e) {
            System.out.println("No hay este numero");
        }
        return true;
    }

    public int randNum() {
        Random rand = new Random();
        int volver = rand.nextInt(1000);
        return volver;
    }

    public static void main(String[] args) {
        Loteria test = new Loteria();
        test.winOrLose(531);
    }
}
