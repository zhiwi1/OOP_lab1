package com.company;

import java.awt.*;

public abstract class Mathobj {
    private Color borderColor;

    public Mathobj(){
        borderColor = Color.BLACK;
    }

    public Color getBorderColor(){
        return borderColor;
    }

    public void setBorderColor(Color borderColor){
        this.borderColor = borderColor;
    }


    public abstract void draw(Graphics g);
}
