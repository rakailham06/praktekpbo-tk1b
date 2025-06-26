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

public class MainDynamicKendaraan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Input Data Mobil ===");
        System.out.print("Merk Mobil: ");
        String merkMobil = scanner.nextLine();
        System.out.print("Tahun Mobil: ");
        int tahunMobil = scanner.nextInt();
        System.out.print("Jumlah Pintu: ");
        int jumlahPintu = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline
        System.out.print("Transmisi (Manual/Automatic): ");
        String transmisi = scanner.nextLine();
        Mobil mobil = new Mobil(merkMobil, tahunMobil, jumlahPintu, transmisi);
        
        System.out.println("\n=== Input Data Motor ===");
        System.out.print("Merk Motor: ");
        String merkMotor = scanner.nextLine();
        System.out.print("Tahun Motor: ");
        int tahunMotor = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline
        System.out.print("Tipe Helm (Half Face/Full Face): ");
        String tipeHelm = scanner.nextLine();
        System.out.print("Kapasitas Mesin (cc): ");
        int kapasitasMesin = scanner.nextInt();
        Motor motor = new Motor(merkMotor, tahunMotor, tipeHelm, kapasitasMesin);
        
        System.out.println("\n=== Operasi Mobil ===");
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
        System.out.println("\n=== Operasi Motor ===");
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();
    }
}
