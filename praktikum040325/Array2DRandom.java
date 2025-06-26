/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package praktikum040325;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
import java.util.Random;
public interface Array2DRandom {
    public static void main(String[] args){
        int M[][], N[][], O[][];
        int i, j, b, k, b2, k2;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Masukkan jumlah baris matriks 1 = ");
        b =in.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 1 = ");
        k = in.nextInt();
        System.out.print("Masukkan jumlah baris matriks 2 = ");
        b2 =in.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 2 = ");
        k2 = in.nextInt();
        
        
        M = new int[b][k];
        N = new int[b2][k2];
        O = new int[b][k];
        
        //mengisi array 2d secara random
        System.out.println("Matriks 1 : ");
        for(i=0; i<b; i++){
            for(j=0; j<k; j++){
                M[i][j]=rand.nextInt(60)+1;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriks 2 : ");
        for(i=0; i<b2; i++){
            for(j=0; j<k2; j++){
                N[i][j]=rand.nextInt(30)+1;
                System.out.print(N[i][j]+"\t");
            }
            System.out.println();
        }
        if(b==b2 && k==k2){
            System.out.println("\nPenjumlahan Matriks 1&2 : ");
            for(i=0; i<b; i++){
                for(j=0; j<k; j++){
                   O[i][j] = M[i][j] + N[i][j];
                   System.out.print(O[i][j]+"\t");
                }
             System.out.println();
            }
            System.out.println();
        }
        else{
            System.out.println("Operasi tidak dapat dijalankan karena ukuran matriks berbeda");
        }
    }
}
