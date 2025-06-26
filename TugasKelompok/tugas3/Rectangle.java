/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author rakad
 */
public class Rectangle  implements GeometricObject {
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        this.width = width;
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
    
}
