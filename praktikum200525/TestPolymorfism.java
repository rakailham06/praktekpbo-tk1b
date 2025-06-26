/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author rakad
 */
public class TestPolymorfism {
    public static void main(String[] args) {
        Elektronik barang1 = new Elektronik("Samsung", 2025, 3);
        barang1.display();
        System.out.println();

        Elektronik barang2 = new SmartWatch("Xiaomi", 2024, 2);
        barang2.display();
        System.out.println();

        Elektronik barang3 = new Laptop("HP", 2025, 2, 14, 8);
        barang3.display();
        System.out.println();

        Elektronik barang4 = new Smartphone("Realme", 2025, 2, 5000, 3);
        barang4.display();
    }
}
