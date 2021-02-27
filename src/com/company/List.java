package com.company;

import java.awt.*;
import java.util.ArrayList;

public class List {
    ArrayList<Mathobj> arr=new ArrayList<>();
    List(){

    }
   void print(Graphics g){
        for(int i=0;i< arr.size();i++)
        arr.get(i).draw(g);

    }
}
