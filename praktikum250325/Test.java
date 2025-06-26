/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum250325;

/**
 *
 * @author rakad
 */
public class Test {
    public static void main(String[] args){
        // Membuat objek 1 dari kelas Nasabah dan Tabungan
        Nasabah nasabah1 = new Nasabah("Andyta", "Ilham");
        Tabungan tabungan1 = new Tabungan(5000);
        
        // Membuat objek 2 dari kelas Nasabah dan Tabungan
        Nasabah nasabah2 = new Nasabah("Rakadiredja", "Anak Soleh");
        Tabungan tabungan2 = new Tabungan(7000);
        
        // Menampilkan informasi setiap objek
        System.out.println(nasabah1.toString());
        System.out.println(tabungan1.toString());
        System.out.println(nasabah2.toString());
        System.out.println(tabungan2.toString());
        
        // Objek 1 menabung 4000
        tabungan1.simpanUang(4000);
        System.out.println("\nAndyta Ilham menabung uang sebesar Rp.4000");
        System.out.println("Saldo Andyta Ilham: "+tabungan1.getSaldo());
        
        // Objek 2 menabung 7000
        tabungan2.simpanUang(7000);
        System.out.println("\nRakadiredja Anak Soleh menabung uang sebesar Rp.7000");
        System.out.println("Saldo Rakadiredja Anak Soleh: "+tabungan2.getSaldo());
        
        // Objek 1 mengambil uang 5000
        tabungan1.ambilUang(5000);
        System.out.println("\nAndyta Ilham mengambil uang sebesar Rp.5000");
        System.out.println("Saldo Andyta Ilham: "+tabungan1.getSaldo());
        
        // Objek 2 mengambil 6000
        tabungan2.ambilUang(6000);
        System.out.println("\nRakadiredja Anak Soleh mengambil uang sebesar Rp.6000");
        System.out.println("Saldo Rakadiredja Anak Soleh: "+tabungan2.getSaldo());
        
        // Objek 2 transfer ke objek 1 sebesar 1000
        System.out.println("\nRakadiredja Anak Soleh mentransfer uang sebesar Rp.1000 kepada Andyta Ilham");
        tabungan2.transfer(tabungan1, 1000);
        
        // Menampilkan saldo dari objek 1 dan 2
        System.out.println("\nSaldo akhir Andyta Ilham: "+tabungan1.getSaldo());
        System.out.println("Saldo akhir Rakadiredja Anak Soleh: "+tabungan2.getSaldo());
    }
}
