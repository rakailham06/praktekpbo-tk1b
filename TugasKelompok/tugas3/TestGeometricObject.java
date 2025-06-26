/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author rakad
 */


public class TestGeometricObject {

    public static void main(String[] args) {
        
        // Membuat objek Circle menggunakan referensi GeometricObject
        GeometricObject geo1 = new Circle(5.0);
        
        System.out.println("--- Menguji Objek Lingkaran (Circle) ---");
        System.out.println("Luas: " + geo1.getArea());
        System.out.println("Keliling: " + geo1.getPerimeter());
        // System.out.println(geo1.toString()); // Akan menampilkan detail objek
        System.out.println(); // Spasi untuk pemisah

        // Membuat objek Rectangle menggunakan referensi GeometricObject
        GeometricObject geo2 = new Rectangle(4.0, 6.0);

        System.out.println("--- Menguji Objek Persegi Panjang (Rectangle) ---");
        System.out.println("Luas: " + geo2.getArea());
        System.out.println("Keliling: " + geo2.getPerimeter());
    }
}

