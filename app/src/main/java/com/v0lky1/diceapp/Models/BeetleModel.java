package com.v0lky1.diceapp.Models;

public class BeetleModel {
    private int amountOfSixes = 0;

    public void addSix(){
    amountOfSixes++;
    }

    public int getAmountOfSixes() {
        return amountOfSixes;
    }
}
