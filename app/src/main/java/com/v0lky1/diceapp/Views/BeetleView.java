package com.v0lky1.diceapp.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.v0lky1.diceapp.Models.BeetleModel;

public class BeetleView extends View {
    Paint redPaint;
    BeetleModel beetleModel;

    public BeetleView(Context context) {
        super(context);
        init();
    }

    public BeetleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BeetleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        redPaint = new Paint();
        redPaint.setColor(Color.RED);
    }

    public void setBeetleModel(BeetleModel beetleModel) {
        this.beetleModel = beetleModel;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float height = getHeight();
        float width = getWidth();
        float r = width / 100 * 25 / 2;

        if (beetleModel.getAmountOfSixes() > 0 && beetleModel.getAmountOfSixes() < 10) {
            //draws body
            canvas.drawOval(width / 4, height / 4, width - width / 4, height - height / 4, redPaint);
        }
        if (beetleModel.getAmountOfSixes() > 1 && beetleModel.getAmountOfSixes() < 10) {
            //draws head
            canvas.drawCircle(width / 2, height / 4, r, redPaint);
        }

        //draws legs
        if (beetleModel.getAmountOfSixes() > 2 && beetleModel.getAmountOfSixes() < 10) {
            //right center
            canvas.drawLine(width / 2, height / 2, width, height / 2, redPaint);
        }

        if (beetleModel.getAmountOfSixes() > 3 && beetleModel.getAmountOfSixes() < 10) {
            //left center
            canvas.drawLine(width / 2, height / 2, 0, height / 2, redPaint);
        }

        if (beetleModel.getAmountOfSixes() > 4 && beetleModel.getAmountOfSixes() < 10) {
            //right top
            canvas.drawLine(width / 2, height / 2, width, height / 4, redPaint);
        }

        if (beetleModel.getAmountOfSixes() > 5 && beetleModel.getAmountOfSixes() < 10) {
            //right bottom
            canvas.drawLine(width / 2, height / 2, width, height - height / 4, redPaint);
        }

        if (beetleModel.getAmountOfSixes() > 6 && beetleModel.getAmountOfSixes() < 10) {
            //left top
            canvas.drawLine(width / 2, height / 2, 0, height / 4, redPaint);
        }

        if (beetleModel.getAmountOfSixes() > 7 && beetleModel.getAmountOfSixes() < 10) {
            //left under
            canvas.drawLine(width / 2, height / 2, 0, height - height / 4, redPaint);
        }

        if (beetleModel.getAmountOfSixes() > 8 && beetleModel.getAmountOfSixes() < 10) {
            //draws sensor left
            canvas.drawLine(width / 2, height / 4, width / 4, 0, redPaint);
        }

        if (beetleModel.getAmountOfSixes() > 9 && beetleModel.getAmountOfSixes() < 10) {
            //draw sensor right
            canvas.drawLine(width / 2, height / 4, width - width / 4, 0, redPaint);
        }
    }
}
