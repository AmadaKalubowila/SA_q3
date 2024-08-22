package org.example;

public class ShapeFactory {
    //--- shape object reference---
    Shape shape;
    //---Return shape according to shapeType----
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null; //---if shape type is null return null---
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();//---if shape type is square return square object---
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();//---if shape type is circle return circle object---
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();//---if shape type is rectangle return rectangle object---
        }
        if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();//---if shape type is triangle return triangle object---
        }
        return new InvalidShape();//---if shape type is invalid return invalid object---
    }
}
