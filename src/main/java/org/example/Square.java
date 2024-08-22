package org.example;

public class Square implements Shape{
    //---Override the method draw from shape interface---
    @Override
    public void draw(){
        System.out.println("* * * *\n* * * *\n* * * *\n* * * *");

    }
}
