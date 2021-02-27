package com.company;



import com.company.figure.*;
import com.company.figure.Rectangle;
import com.company.special.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;

class MainWindow extends JPanel {

    static Drawer shapesDrawer = new Drawer();

    public MainWindow(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(shapesDrawer, BorderLayout.WEST);

    }


    public static void main(String[] args) {


Polyline polyline =new Polyline();
polyline.addPoint(new Point(100,3));
        polyline.addPoint(new Point(5,9));
        polyline.addPoint(new Point(3,10));
        shapesDrawer.addShape(polyline);

        Triangle triangle=new Triangle(new Point(1,1),new Point(100,100),new Point(200,250));
shapesDrawer.addShape(triangle);
        Rectangle rectangle=new Rectangle(new Point(300,300),123,421);
shapesDrawer.addShape(rectangle);
        Line line =new Line(new Point(23,21),new Point(124,78));
        shapesDrawer.addShape(line);
        Ellipse ellipse=new Ellipse(new java.awt.Point(12,43),12,32);
        shapesDrawer.addShape(ellipse);
        Circle circle=new Circle(new java.awt.Point(50,124),25);
        shapesDrawer.addShape(circle);
        JFrame mainFrame = new JFrame("Лабораторная работа №1, 2");
        mainFrame.setVisible(true);
        mainFrame.setMinimumSize(new Dimension(500, 400));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setContentPane(new MainWindow());
        mainFrame.pack();

        shapesDrawer.draw();

    }
}
