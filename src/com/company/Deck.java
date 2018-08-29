package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Kaart> deck;

    public Deck() {
        deckMaken();
    }

    public ArrayList<Kaart> deckMaken(){

        char[] waarden = {'2','3','4','5','6','7','8','9','t','b','q','k','a'};
        char[] type =   {'K', 'R', 'S','H'};
        deck = new ArrayList();
        for(int i=0; i<4;i++){
            for(int j=0;j<13;j++) {
                deck.add(new Kaart(waarden[j], type[i]));
            }

        }
        return deck;

    }

    public ArrayList deckSchudden(){
        Collections.shuffle(deck);
        return deck;
    }
    public Kaart kaartPakken(){                     // kan nog sneller met enkel deck.remove(0) in de return
        Kaart kaart = deck.get(0);
        deck.remove(0);

        return kaart;
    }
}

