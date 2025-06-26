/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum150425;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
public class MainHewan {
    public static void main(String args[] ) {
        ///buat objek
        Scanner in = new Scanner(System.in);
        System.out.print("Siapa nama kucingnya? = ");
        String namaKucing = in.nextLine();
        System.out.print("Siapa nama anjingnya? = ");
        String namaAnjing = in.nextLine();
        
        Hewan hewanumum = new Hewan("Makhluk Hidup");
        Kucing kucingku = new Kucing(namaKucing);
        Anjing anjingku = new Anjing(namaAnjing);
        
        hewanumum.tampilkanNama();
        hewanumum.Suara();
        
        System.out.println();
        kucingku.tampilkanNama();
        kucingku.Suara();
        System.out.println();
        anjingku.tampilkanNama();
        anjingku.Suara();
    }
}
