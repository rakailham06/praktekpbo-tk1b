/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author rakad
 */
import java.util.Random;
import java.util.Scanner;

public class OperasiMatriks {
    // Method untuk mengisi matriks dengan angka random
    public static int[][] generateMatriks(int baris, int kolom) {
        Random rand = new Random();
        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = rand.nextInt(10);
            }
        }
        return matriks;
    }
    // Method untuk menampilkan matriks
    public static void printMatriks(int[][] matriks) {
        for (int[] row : matriks) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
    // Operasi penjumlahan matriks
    public static int[][] tambahMatriks(int[][] A, int[][] B) {
        int baris = A.length, kolom = A[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }
        return hasil;
    }
    // Operasi pengurangan matriks
    public static int[][] kurangMatriks(int[][] A, int[][] B) {
        int baris = A.length, kolom = A[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = A[i][j] - B[i][j];
            }
        }
        return hasil;
    }
    // Operasi perkalian matriks
    public static int[][] kaliMatriks(int[][] A, int[][] B) {
        int baris = A.length, kolom = B[0].length, n = B.length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                for (int k = 0; k < n; k++) {
                    hasil[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return hasil;
    }
    // Matriks identitas
    public static int[][] identitasMatriks(int n) {
        int[][] identitas = new int[n][n];
        for (int i = 0; i < n; i++) {
            identitas[i][i] = 1;
        }
        return identitas;
    }
    // Transpose matriks
    public static int[][] transposeMatriks(int[][] A) {
        int baris = A.length, kolom = A[0].length;
        int[][] hasil = new int[kolom][baris];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[j][i] = A[i][j];
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ulangi = null;
        do {
            System.out.println("\nMenu Operasi Matriks:");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Identitas");
            System.out.println("5. Transpose");
            System.out.println("6. Exit");
            System.out.print("Pilih operasi (1-6): ");
            int pilihan = in.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan jumlah baris: ");
                int baris = in.nextInt();
                System.out.print("Masukkan jumlah kolom: ");
                int kolom = in.nextInt();
                
                if (pilihan == 4 && baris != kolom) {
                    System.out.println("Matriks identitas hanya untuk matriks persegi!");
                    continue;
                }
                int[][] A = generateMatriks(baris, kolom);
                System.out.println("Matriks A:");
                printMatriks(A);
                
                if (pilihan == 1 || pilihan == 2 || pilihan == 3) {
                    int[][] B = generateMatriks(baris, kolom);
                    System.out.println("Matriks B:");
                    printMatriks(B);
                    
                    int[][] hasil;
                    if (pilihan == 1) {
                        hasil = tambahMatriks(A, B);
                    } else if (pilihan == 2) {
                        hasil = kurangMatriks(A, B);
                    } else {
                        hasil = kaliMatriks(A, B);
                    }
                    System.out.println("Hasil:");
                    printMatriks(hasil);
                } else if (pilihan == 4) {
                    System.out.println("Matriks Identitas:");
                    printMatriks(identitasMatriks(baris));
                } else {
                    System.out.println("Transpose Matriks:");
                    printMatriks(transposeMatriks(A));
                }
            } else if (pilihan != 6) {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            
            System.out.print("Apakah ingin mengulang program? (y/n): ");
            ulangi = in.next();
        } while (ulangi.equalsIgnoreCase("y"));

        System.out.println("Program selesai.");
    }
}