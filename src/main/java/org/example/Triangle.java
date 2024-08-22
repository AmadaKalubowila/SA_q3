package org.example;

public class Triangle implements Shape{
    //---Override the method draw from shape interface---
    @Override
    public void draw(){
        System.out.println("   *");
        System.out.println("  * *");
        System.out.println(" * * *");
        System.out.println("* * * *");
    }
}
