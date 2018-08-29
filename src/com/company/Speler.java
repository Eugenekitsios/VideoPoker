package com.company;

import java.util.ArrayList;

public class Speler {
    private  int geld;
    private ArrayList<Kaart> hand = new ArrayList<Kaart>();
    private int leeftijd; //Moet van euzjen
    ArrayList<Kaart> getHand(){
        return hand;
    }





    void geefKaart(Kaart kaart){
        hand.add(kaart);
    }
}
