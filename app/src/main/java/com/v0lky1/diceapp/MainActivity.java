package com.v0lky1.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.v0lky1.diceapp.Models.DiceModel;
import com.v0lky1.diceapp.Views.DiceView;

public class MainActivity extends AppCompatActivity {
        DiceModel diceModel = new DiceModel();
        Button throwDice;

        DiceView diceTwo;
        DiceView diceOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        diceOne = findViewById(R.id.diceViewOne);
        diceOne.setDiceModel(diceModel);
        diceTwo = findViewById(R.id.diceViewTwo);
        diceTwo.setDiceModel(diceModel);
        throwDice = findViewById(R.id.throwDice);

    }

    public void clickListener(View view) {
        int randomNrOne = (int) (Math.random()*6)+1;
        diceModel.setNumberDice(randomNrOne);

        int randomNrTwo = (int) (Math.random()*6)+1;
        diceModel.setNumberDice(randomNrTwo);


        diceOne.invalidate();
        diceTwo.invalidate();
    }
}
