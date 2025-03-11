/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author rakad
 */
import java.util.Scanner;

public class Swalayan{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int hargaX = 40000;
        int hargaY = 50000;
        int hargaZ = 60000;
        
        System.out.print("Pilih merek susu: (X/Y/Z) = ");
        String merek = in.next().toUpperCase();
        
        System.out.print("Masukkan jumlah kotak yang dibeli = ");
        int jumlah = in.nextInt();
        
        double totalHarga = 0;
        double diskon = 0;
        
        switch (merek) {
            case "X":
                totalHarga = jumlah * hargaX;
                if (jumlah >= 3) {
                    diskon = totalHarga * 0.10;
                }
                break;
            
            case "Y":
                totalHarga = jumlah * hargaY;
                if (jumlah > 3) {
                    diskon = totalHarga * 0.12;
                }
                break;
                
            case "Z":
                if (jumlah >= 1) {
                    totalHarga = hargaZ;
                }
                if (jumlah > 1) {
                    double hargaDiskon = (jumlah - 1) * hargaZ * 0.85;
                    totalHarga += hargaDiskon;
                    diskon = (jumlah - 1) * hargaZ * 0.15;
                }
                break;
                
            default:
                System.out.println("Merek tidak valid.");
                return;
        }
        
        double totalBayar = totalHarga - diskon;
        
        System.out.println("Total harga: Rp." + totalHarga);
        System.out.println("Diskon: Rp." + diskon);
        System.out.println("Total yang harus dibayar: Rp." + totalBayar);
    }
}