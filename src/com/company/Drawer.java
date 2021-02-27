package com.company;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

public class Drawer extends JPanel {
    private List<Mathobj> shapesList =  new ArrayList<>();


    public Drawer(){
        setBackground(Color.WHITE);

    }



    public void draw(){
        repaint();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Mathobj shape : shapesList){
            shape.draw(g);
        }
    }





    private void removeLast(){
        if (shapesList.size() > 0) {
            shapesList.remove(shapesList.size() - 1);
        }
        draw();
    }

    public void addShape(Mathobj f) {
       
        shapesList.add(f);
    }


}
