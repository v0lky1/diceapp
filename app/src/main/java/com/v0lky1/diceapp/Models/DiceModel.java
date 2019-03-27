package com.v0lky1.diceapp.Models;

public class DiceModel {
    private int rolled;

    public int getRolled() {
        return rolled;
    }

    public void roll() {
        rolled = (int) (Math.random() * 6) + 1;
    }
}
