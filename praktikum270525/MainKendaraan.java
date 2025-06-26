/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270525;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 2022, 4, "Automatic");
        Motor motor = new Motor("Yamaha NMAX", 2023, "Full Face", 155);
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
        System.out.println();
        
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();
    }
}
