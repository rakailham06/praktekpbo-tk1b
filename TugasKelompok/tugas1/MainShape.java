/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
public class MainShape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Shape[] shapes = new Shape[3];
        
        System.out.println("--Tes Tugas 1--");
        
        System.out.println("Masukkan data untuk Lingkaran");
        System.out.print("Jari-jari: ");
        double radius = in.nextDouble();
        System.out.print("Warna: ");
        String circleColor = in.next();
        System.out.print("Terisi (True/False):");
        boolean circleFilled = in.nextBoolean();
        shapes[0] = new Circle(radius, circleColor, circleFilled);
        System.out.println();
        
        System.out.println("Masukkan data untuk Persegi Panjang");
        System.out.print("Lebar: ");
        double width = in.nextDouble();
        System.out.print("Panjang: ");
        double length = in.nextDouble();
        System.out.print("Warna: ");
        String rectColor = in.next();
        System.out.print("Terisi (True/False):");
        boolean rectFilled = in.nextBoolean();
        shapes[1] = new Rectangle(width, length, rectColor, rectFilled);
        System.out.println();
        
        System.out.println("Masukkan data untuk Persegi");
        System.out.print("Sisi: ");
        double side = in.nextDouble();
        System.out.print("Warna: ");
        String squareColor = in.next();
        System.out.print("Terisi (True/False): ");
        boolean squareFilled = in.nextBoolean();
        shapes[2] = new Square(side, squareColor, squareFilled);
        System.out.println();
        
        System.out.println("--Hasil Uji Coba--");
        for (Shape shape : shapes){
            System.out.println(shape.toString());
        }
    }
    
    
}
