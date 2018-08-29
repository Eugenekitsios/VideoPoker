package com.company;

public class Kaart {


    private char waarde;
    private char type; //makkelijk switch met char - niet zo makkelijk met Strings. Ook makkelijker te vergelijken.

    public Kaart(char waarde, char type) {
        this.waarde = waarde;
        this.type = type;

    }
}
