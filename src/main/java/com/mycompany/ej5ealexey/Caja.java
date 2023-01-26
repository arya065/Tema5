package com.mycompany.ej5ealexey;

import java.util.*;

public class Caja {

    private Cinta cinta;
    private int id;

    public Caja(int id) {
        this.cinta = new Cinta();
        this.id = id;
    }

    public Ticket generarTicket() {
        Ticket tmp = new Ticket(this.cinta.getCinta());
        tmp.sortTicket();
        return tmp;
    }

    public Cinta getCinta() {
        return cinta;
    }
    

}