/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum180325;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
public class TextVehicleEncapsulation {
    public static void main(String [] args){
        System.out.println("Kendaraan 1. Beban maksimal 10.000 kg");
        VehicleEncapsulation kendaraan1 = new VehicleEncapsulation(10000);
        
        //menambahkan beban
        System.out.println("Menambahkan beban 1 (500 kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2 (250 kg)"+kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3 (5000 kg)"+kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4 (4000 kg)"+kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5 (350 kg)"+kendaraan1.addLoad(350));
        
        //menampilkan beban kendaraan saat ini
        System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad());
        
        //membuat objek kendaraan2 menggunakan konstruktor kosong
        Scanner in = new Scanner(System.in);
        System.out.println("\nKendaraan 2. Beban maksimal belum ada.");
        VehicleEncapsulation kendaraan2 = new VehicleEncapsulation();
        //set maxload menggunakan methos setMaxLoad
        System.out.print("Masukkan beban maksimal kendaraan = ");
        double bebanMax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanMax);
        //isi beban pada kendaraan
        System.out.print("Masukkan berat beban yang akan diletakkan = ");
        double beban = in.nextDouble();
        while (kendaraan2.addLoad(beban)){ //default true
            System.out.println("Beban ditambahkan"+beban+" Kg");
            System.out.print("Masukkan berat beban yang akan diletakkan = ");
            beban = in.nextDouble();
        }
        if(!kendaraan2.addLoad(beban)){ //not true ==> false
            System.out.println("Beban kendaraan saat ini = "+kendaraan2.getLoad()+" Kg");
            System.out.println("Beban akan berlebih. Penambah beban dibatalkan");
        }else
            System.out.println("Beban kendaran saat ini = "+kendaraan2.getLoad()+" Kg");
    }
}
