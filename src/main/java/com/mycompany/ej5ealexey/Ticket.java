package com.mycompany.ej5ealexey;

import java.util.*;
import java.time.*;

public class Ticket {

    ArrayList<Producto> cinta;//list of cinta
    LocalDateTime createDate;

    public Ticket(ArrayList<Producto> prod) {
        this.cinta = prod;
        this.createDate = LocalDateTime.now();
    }

//sort ticket by iva
    public void sortTicket() {
        ArrayList<Producto> tmpCinta = (ArrayList<Producto>) cinta.clone();
        Collections.sort(cinta);
    }

    @Override
    public String toString() {
        String date = "" + createDate.getDayOfMonth() + "/" + createDate.getMonthValue() + "/" + createDate.getYear();// string de data
        String hour = "" + createDate.getHour() + ":" + createDate.getMinute(); // string de hora
        String products = ""; // string de productos
        String ivaQuantity = ""; // string de cantidades de productos de cada iva

        //variables para iva de 4%
        int iva4 = 0;
        double precioSinIva4 = 0;
        double precioConIva4 = 0;

        //variables para iva de 10%
        int iva10 = 0;
        double precioSinIva10 = 0;
        double precioConIva10 = 0;

        //variables para iva de 21%
        int iva21 = 0;
        double precioSinIva21 = 0;
        double precioConIva21 = 0;

        double totalPrice = 0;

        // ciclo para leer todos datos de array
        for (int i = 0; i < cinta.size(); i++) {
            String name = cinta.get(i).getName();
            int cantidad = cinta.get(i).getCantidad();
            int iva = cinta.get(i).getIva();
            double priceIva = (cinta.get(i).getPrice()) * ((100 + iva) / 100);
            double price = cinta.get(i).getPrice();
            products += name + "          " + price + "         " + cantidad + "           " + iva + "           " + priceIva + "\n";
            if (cinta.get(i).getIva() == 4) {
                iva4 += cantidad;
                precioSinIva4 += price * cantidad;
                precioConIva4 += priceIva * cantidad;
            } else if (cinta.get(i).getIva() == 10) {
                iva10 += cantidad;
                precioSinIva10 += price * cantidad;
                precioConIva10 += priceIva * cantidad;
            } else {
                iva21 += cantidad;
                precioSinIva21 += price * cantidad;
                precioConIva21 += priceIva * cantidad;
            }
            totalPrice += priceIva * cantidad;
        }

        ivaQuantity += "N prod. iva 4%:" + iva4 + "    Precio sin IVA:" + precioSinIva4 + "       Precio con IVA:" + precioConIva4 + "\n"
                + "N prod. iva 10%:" + iva10 + "    Precio sin IVA:" + precioSinIva10 + "       Precio con IVA:" + precioConIva10 + "\n"
                + "N prod. iva 21%:" + iva21 + "    Precio sin IVA:" + precioSinIva21 + "       Precio con IVA:" + precioConIva21;
        String volver
                = "--------------------------------------------------------------------------------\n"
                + "                          Supermercados El                                      \n"
                + "Fecha: " + date + "\n"
                + "Hora: " + hour + "\n"
                + "--------------------------------------------------------------------------------\n"
                + "  Producto     Precio     Cantidad      IVA      Precio sin IVA                 \n"
                + "--------------------------------------------------------------------------------\n"
                + products + "\n"
                + "--------------------------------------------------------------------------------\n"
                + ivaQuantity + "\n"
                + "--------------------------------------------------------------------------------\n"
                + "Total a pagar:" + totalPrice + "  --  Gracias por su visita" + "\n"
                + "--------------------------------------------------------------------------------\n";
        System.out.println(volver);
        return volver;
    }

}