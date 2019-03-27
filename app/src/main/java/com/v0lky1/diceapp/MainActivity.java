package com.v0lky1.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.v0lky1.diceapp.Models.BeetleModel;
import com.v0lky1.diceapp.Models.DiceModel;
import com.v0lky1.diceapp.Views.BeetleView;
import com.v0lky1.diceapp.Views.DiceView;

public class MainActivity extends AppCompatActivity {
    DiceModel diceModelOne = new DiceModel();
    DiceModel diceModelTwo = new DiceModel();
    DiceModel diceModelThree = new DiceModel();
    BeetleModel beetleModel = new BeetleModel();

    DiceView diceOne;
    DiceView diceTwo;
    DiceView diceThree;
    BeetleView beetleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceOne = findViewById(R.id.diceViewOne);
        diceOne.setDiceModel(diceModelOne);
        diceTwo = findViewById(R.id.diceViewTwo);
        diceTwo.setDiceModel(diceModelTwo);
        diceThree = findViewById(R.id.diceViewThree);
        diceThree.setDiceModel(diceModelThree);

        beetleView = findViewById(R.id.beetleView);
        beetleView.setBeetleModel(beetleModel);

    }

    public void clickListener(View view) {
        diceModelOne.roll();
        diceModelTwo.roll();
        diceModelThree.roll();

        int diceOneRolled = diceModelOne.getRolled();
        int diceTwoRolled = diceModelTwo.getRolled();
        int diceThreeRolled = diceModelThree.getRolled();

        if (diceOneRolled == 6) {
            beetleModel.addSix();
            Log.i("Rolled a Six", "clickListener: Six added");
        }
        if (diceTwoRolled == 6) {
            beetleModel.addSix();
        }
        if (diceThreeRolled == 6) {
            beetleModel.addSix();
        }


        diceOne.invalidate();
        diceTwo.invalidate();
        diceThree.invalidate();
        beetleView.invalidate();
    }
}
