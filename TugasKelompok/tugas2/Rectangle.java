/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author rakad
 */
public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
    
    @Override
    public String toString(){
        return "Rectangle";
    }
}
