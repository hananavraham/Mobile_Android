package com.example.hananavr.homeworkapps;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import java.util.Random;

public class Circle {
    private int leftTopX;
    private int leftTopY;
    private int radius;
    private Paint paint;
    private RectF bounds;
    private int speedX;
    private int speedY;
    private int maxX;
    private int maxY;

    public Circle(int color) {
        this.paint = new Paint();
        paint.setColor(color);
        bounds = new RectF();
    }

    public void setCOORD(int x, int y, int radius){
        this.leftTopX = x;
        this.leftTopY = y;
        this.radius = radius;
        bounds.set(this.leftTopX,this.leftTopY,this.leftTopX+ this.radius*2,this.leftTopY+this.radius*2);
    }

    public void setSpeed(int spdX, int spdY){
        this.speedX = spdX;
        this.speedY = spdY;
    }

    public void setMax(int x, int y){
        this.maxX = x;
        this.maxY = y;
    }
    public void draw(Canvas canvas){
        canvas.drawOval(bounds,paint);
        update();
    }

    private void update() {

        if (leftTopX + 2 * radius > maxX){
            speedX = speedX * -1;
        }
        else if (leftTopX < 0) {
            speedX = speedX * -1;
        }

        if (leftTopY + 2 * radius > maxY){
            speedY = speedY * -1;
        }
        else if (leftTopY < 0){
            speedY = speedY * -1;
        }
        leftTopX = leftTopX + speedX;
        leftTopY = leftTopX + speedY;

        bounds.set(leftTopX , leftTopY , leftTopX + 2 * radius , leftTopY + 2 * radius);
    }
}
