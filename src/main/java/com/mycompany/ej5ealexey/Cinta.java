package com.mycompany.ej5ealexey;

import java.util.*;

public class Cinta {

    private ArrayList<Producto> cinta;

    public Cinta() {
        this.cinta = new ArrayList<>();
    }

    public void putProduct(int iva, String nameProduct, double price) {
        int numProducto = 0;
        do {
            numProducto = askNumProd();//ciclo de preguntar
        } while (numProducto == -1);
        Producto tmp = new Producto(iva, nameProduct, price, numProducto);
        cinta.add(tmp);
    }

    public void deleteProductIndex(Producto tmp) {
        cinta.remove(tmp);
    }

    public boolean isEmpty() {
        return cinta.isEmpty();
    }

// ciclo de preguntar
    public int askNumProd() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero de producto");
        try {
            int volver = in.nextInt();
            if (volver < 0) {
                throw new InputMismatchException();
            }
            return volver;
        } catch (InputMismatchException e) {
            System.out.println("Introduce numero correcto");
        }
        return -1;
    }

// filtrar cinta por iva
    public void sortCinta() {
        Collections.sort(cinta);
    }

    public void trimToSizeCinta() {
        cinta.trimToSize();
    }

    public ArrayList<Producto> getCinta() {
        return cinta;
    }

}