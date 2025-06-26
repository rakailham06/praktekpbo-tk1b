/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum040325;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
import java.util.Random;
public class Array1DRandom {
    public static void main(String[] args){
        int A[], i, n;
        int jumlahGenap=0, banyakGenap=0;
        int jumlahGanjil=0, banyakGanjil=0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();
        A = new int[n];
        System.out.println("\n--Data Anda--");
        for(i=0; i<n; i++){
            A[i] = rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println("\n\nData array bernilai genap : ");
        for(i=0; i<n; i++){
            if(A[i]%2==0){
                System.out.print(A[i]+"\t");
                banyakGenap = banyakGenap+1;
                jumlahGenap = jumlahGenap+A[i];
            }  
        }
        System.out.println("\n\nData array bernilai ganjil : ");
        for(i=0; i<n; i++){
            if(A[i]%2==1){
                System.out.print(A[i]+"\t");
                banyakGanjil = banyakGanjil+1;
                jumlahGanjil = jumlahGanjil+A[i];
            }  
        }
        System.out.println();
        System.out.println("\nBanyak array genap : "+banyakGenap);
        System.out.println("\nJumlah array genap : "+jumlahGenap);
        System.out.println("\nBanyak array ganjil : "+banyakGanjil);
        System.out.println("\nJumlah array ganjil : "+jumlahGanjil);
        System.out.println();
    }
}
