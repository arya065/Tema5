package ej5G;

import java.util.*;

public class Loteria {

    HashMap<String, Integer> loteria;

    public Loteria() {
        this.loteria = new HashMap<>();
        completeLoteria();
    }

    public void completeLoteria() {
        for (int i = 0; i < 1000; i++) {
            int tmp = randNum(1000);
            String key = "";
            if (tmp < 10) {
                key = "0000" + Integer.toString(tmp);
            } else if (tmp < 100 && tmp >= 10) {
                key = "000" + Integer.toString(tmp);
            } else if (tmp < 1000 && tmp >= 100) {
                key = "00" + Integer.toString(tmp);
            } else {
                key = "0" + Integer.toString(tmp);
            }
            if (tmp % 5 == 0) {
                this.loteria.put(key, randNum(100000));
            } else {
                this.loteria.put(key, 0);
            }
        }
    }

    public int winOrLose(String key) {//sabes si has ganado
        try {
            int result = loteria.get(key);
            if (result != 0) {
                System.out.println("Has ganado");
                return result;
            } else {
                System.out.println("Ooops...");
            }
        } catch (java.lang.NullPointerException e) {
            System.out.println("No hay este numero");
        }
        return 0;
    }

    public int randNum(int count) {
        Random rand = new Random();
        int volver = rand.nextInt(count) - 1;
        return volver;
    }

    @Override
    public String toString() {
        return "Loteria{" + "loteria=" + loteria + '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Loteria test = new Loteria();
        System.out.println(test.toString());

        while (true) {
            System.out.println("Introduce numero de loteria");
            String num = in.nextLine();
            int sout = test.winOrLose(num);
            System.out.println(sout);
        }
    }
}
