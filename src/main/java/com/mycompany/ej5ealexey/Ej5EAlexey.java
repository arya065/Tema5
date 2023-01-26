package com.mycompany.ej5ealexey;

public class Ej5EAlexey {

    public static void main(String[] args) {
        Caja test = new Caja(23);
        test.getCinta().putProduct(4, "test1", 10);
        test.getCinta().putProduct(21, "test2", 5);
        test.getCinta().putProduct(10, "test3", 2);

        System.out.println(test.generarTicket().toString());
    }
}