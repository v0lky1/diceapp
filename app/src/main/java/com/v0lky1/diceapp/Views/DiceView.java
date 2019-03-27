package com.v0lky1.diceapp.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.v0lky1.diceapp.Models.DiceModel;

public class DiceView extends View {
    private Paint paint;
    private DiceModel diceModel;

    public DiceView(Context context) {
        super(context);
        init();
    }

    public DiceView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DiceView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DiceView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        paint = new Paint();
        paint.setColor(Color.MAGENTA);
    }

    public void setDiceModel(DiceModel diceModel) {
        this.diceModel = diceModel;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float r = width / 100 * 10 / 2;


        if (diceModel.getNumberDice() == 1) {
            canvas.drawCircle(width / 2, height / 2, r, paint);
            //done
        } else if (diceModel.getNumberDice() == 2) {
            canvas.drawCircle(width / 4, height / 4, r, paint);
            canvas.drawCircle(width - width / 4, height - height / 4, r, paint);

        } else if (diceModel.getNumberDice() == 3) {
            canvas.drawCircle(width / 4, height / 4, r, paint);
            canvas.drawCircle(width / 2, height / 2, r, paint);
            canvas.drawCircle(width - width / 4, height - height / 4, r, paint);


        } else if (diceModel.getNumberDice() == 4) {
            canvas.drawCircle(width / 4, height / 4, r, paint); //25, 25
            canvas.drawCircle(width - width / 4, height - height / 4, r, paint); //75 75
            canvas.drawCircle(width - width / 4, height / 4, r, paint); //75 25
            canvas.drawCircle(width/4, height - height /4, r, paint); //25 75


        } else if (diceModel.getNumberDice() == 5) {
            canvas.drawCircle(width / 4, height / 4, r, paint); //25, 25
            canvas.drawCircle(width - width / 4, height - height / 4, r, paint); //75 75
            canvas.drawCircle(width - width / 4, height / 4, r, paint); //75 25
            canvas.drawCircle(width/4, height - height /4, r, paint); //25 75
            canvas.drawCircle(width / 2, height / 2, r, paint);

        } else if (diceModel.getNumberDice() == 6) {
            canvas.drawCircle(width / 4, height / 4, r, paint); //25, 25
            canvas.drawCircle(width - width / 4, height - height / 4, r, paint); //75 75
            canvas.drawCircle(width - width / 4, height / 4, r, paint); //75 25
            canvas.drawCircle(width/4, height - height /4, r, paint); //25 75
            //25 50
            canvas.drawCircle(width/4, height/2, r, paint);
            //75 50
            canvas.drawCircle(width-width/4, height/2, r, paint);


        }


    }
}
