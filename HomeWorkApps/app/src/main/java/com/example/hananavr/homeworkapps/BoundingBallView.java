package com.example.hananavr.homeworkapps;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class BoundingBallView extends View {

    int maxX;
    int maxY;
    int oldX;
    int oldY;
    private Circle ball;
    private Rect rectangle;
    private Paint rectPaint;

    private static int SQUARE_SIZE = 100;
    ArrayList<Circle> ballList = new ArrayList<Circle>();

//    @Override
////    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
////        super.onSizeChanged(w, h, oldw, oldh);
////        maxX = w;
////        maxY = h;
////
////        Iterator it = ballList.iterator();
////        while(it.hasNext()){
////            Circle ball = (Circle) it.next();
////            ball.setMax(maxX, maxY);
////        }
////    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        maxX = w;
        maxY = h;
    }

    public BoundingBallView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /** create the rectangle **/
        rectangle = new Rect();
        rectPaint = new Paint();
        rectPaint.setColor(Color.GREEN);
        rectPaint.setStyle(Paint.Style.FILL);

        canvas.drawRect(450,600,900,1000,rectPaint);

        /***************************/


        Iterator it = ballList.iterator();
        while(it.hasNext()){
            Circle ball = (Circle) it.next();
            ball.draw(canvas);
        }
        invalidate();
    }

    public boolean onTouchEvent (MotionEvent event){
        int eventAction = event.getAction();
        if (eventAction == MotionEvent.ACTION_DOWN){
            if (ballList.size() == 10) {
                ballList.remove(1);
                ballList.remove(3);
                return true;
            }


            /** checking if we click inside the rectangle  **/
            if((event.getX() >= 350 && event.getX() <= 1000) && (event.getY() >= 500 && event.getY() <= 1100))
                return true;

            Random random = new Random();
            int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
            ball = new Circle(color);

            /** creating the ball in touch position.. **/
            ball.setCOORD(event.getX() ,event.getY(), 45);

            ball.setSpeed(5,8);
            ballList.add(ball);

            return true;
        }

        return false;
    }
}
