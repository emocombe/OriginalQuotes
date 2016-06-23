package com.ernesternest.originalquotes;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by PC on 4/17/2016.
 */
public class ColorWheel {
    private String[] mColor ={
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getcolor(){


        String color;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColor.length);
        color = mColor[randomNumber];
        int ColorAsInt = Color.parseColor(color);


        return ColorAsInt;
    }
}

