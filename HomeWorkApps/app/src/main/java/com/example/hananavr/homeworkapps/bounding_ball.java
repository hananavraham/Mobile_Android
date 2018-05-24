package com.example.hananavr.homeworkapps;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

public class bounding_ball extends AppCompatActivity {

    BoundingBallView boundingBallView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boundingBallView = new BoundingBallView(this);
        setContentView(boundingBallView);
        boundingBallView.setBackgroundColor(Color.BLACK);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
