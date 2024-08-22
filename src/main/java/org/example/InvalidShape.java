package org.example;

public class InvalidShape implements Shape{
    //---Override the method draw from shape interface---
    @Override
    public void draw(){
        System.out.println("Invalid shape type provided.");
    }
}
