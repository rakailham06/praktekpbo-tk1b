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

public class PermutasiDanKombinasi {
    public static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static long hitungPermutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }
    public static long hitungKombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan nilai r: ");
        int r = scanner.nextInt();
        
        if (n < 0 || r < 0 || n < r) {
            System.out.println("Input tidak valid! Pastikan n >= r dan keduanya tidak negatif.");
        } else {
            System.out.println("Permutasi P(" + n + ", " + r + ") = " + hitungPermutasi(n, r));
            System.out.println("Kombinasi C(" + n + ", " + r + ") = " + hitungKombinasi(n, r));
        }
        scanner.close();
    }
}