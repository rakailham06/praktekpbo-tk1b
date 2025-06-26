/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum220425;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
public class MainLingkaran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Jari-jari = ");
        double r = in.nextDouble();
        System.out.print("Masukkan Tinggi = ");
        double t = in.nextDouble();
        
        Lingkaran l1 = new Lingkaran(r);
        Kerucut k1 = new Kerucut(r,t);
        Silinder s1 = new Silinder(r,t);
        
        System.out.println(l1);
        System.out.println();
        System.out.println(k1);
        System.out.println();
        System.out.println(s1);
    }
}
