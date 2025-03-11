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

public class GabungArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukkan ukuran array A: ");
        int ukuranA = in.nextInt();
        int[] arrayA = new int[ukuranA];
        
        System.out.print("Masukkan ukuran array B: ");
        int ukuranB = in.nextInt();
        int[] arrayB = new int[ukuranB];
        
        for (int i = 0; i < ukuranA; i++) {
            arrayA[i] = rand.nextInt(100);
        }
        
        for (int i = 0; i < ukuranB; i++) {
            arrayB[i] = rand.nextInt(100);
        }
        
        int[] arrayC = new int[ukuranA + ukuranB];
        int index = 0;
        
        if (ukuranA >= ukuranB) {
            for (int i = 0; i < ukuranA; i++) {
                arrayC[index++] = arrayA[i];
            }
            for (int i = 0; i < ukuranB; i++) {
                arrayC[index++] = arrayB[i];
            }
        } else {
            for (int i = 0; i < ukuranB; i++) {
                arrayC[index++] = arrayB[i];
            }
            for (int i = 0; i < ukuranA; i++) {
                arrayC[index++] = arrayA[i];
            }
        }
       
        System.out.print("Array A: ");
        for (int i = 0; i < ukuranA; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        System.out.println();
        
        System.out.print("Array B: ");
        for (int i = 0; i < ukuranB; i++) {
            System.out.print(arrayB[i] + "\t");
        }
        System.out.println();
        
        System.out.print("Array C: ");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + "\t");
        }
        System.out.println();
    }
}