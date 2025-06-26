/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author rakad
 */
public class Circle implements GeometricObject{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return "Jari-jari: " + radius
                + "Luas: " + getArea()
                + "Keliling: " + getPerimeter();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
