package com.company;

import java.text.NumberFormat;

public class Spel {
    Deck deck;
    Speler speler;


    public Spel (){
        deck = new Deck();
        speler = new Speler();
        initialize();
        start();
    }

    void start(){
        int[] inputNumbers = new int[0];
        printSpel();
        boolean validInput = false;
        while(!validInput){
            String input = UserInput.getInput();
            try{
                int inputLength = input.length();
                inputNumbers = new int[input.length()];
                for(int  i  = 0; i<inputLength; i++){
                    String partial = input.substring(i, i+1);                   //"Knipt"  de string in stukken, van 1-2, 2-3, 3-4 etc.
                    inputNumbers[i] = Integer.parseInt(partial);                //Deze functie kan een NumberFormatException geven
                }
                for(int i = 0; i< inputLength; i++){
                    if(!(inputNumbers[i] > 0 && inputNumbers[i] <6)){
                        throw new Exception();
                    }
                }
                validInput = true;
            } catch(Exception e){
                System.out.println("Invalid input, please try again");
            }
        }
        speler.getHand().remove(inputNumbers[0])
    }



    void initialize(){
        deck.deckSchudden();
        for(int i = 0; i<5; i++){
            speler.geefKaart(deck.kaartPakken());
        }
    }

    void printSpel(){
        for(Kaart k: speler.getHand()){
            System.out.print(k.getType());
            System.out.print(k.getWaarde() + " ");
        }
        System.out.println();
    }



}
