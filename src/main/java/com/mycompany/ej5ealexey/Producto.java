package com.mycompany.ej5ealexey;

public class Producto implements Comparable<Producto> {

    private int iva;
    private String name;
    private double price;
    private int cantidad;

    public Producto(int iva, String name, double price, int cantidad) {
        this.iva = iva;
        this.name = name;
        this.price = price;
        this.cantidad = cantidad;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

//check stats prod
    public void getinfo() {
        double priceIva = (100 + iva) / 100 + price;
        System.out.printf("""
                          Nombre producto: %s
                          Precio producto sin IVA: %f
                          Precio producto con IVA: %f
                          Iva producto: %d
                          Cantidad producto: %f
                          
                           """, name, price, priceIva, iva, cantidad);
    }

// metodo de filtrar por iva
    @Override
    public int compareTo(Producto o) {
        return this.iva - o.iva;
    }
}
