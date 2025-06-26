/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270225;

/**
 *
 * @author rakad
 */
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        int n, i;
        
        Scanner in = new Scanner(System.in);
        System.out.println("=-=Program Pengulangan=-=");
        System.out.print("Masukkan banyak perulangan: ");
        n = in.nextInt();
        System.out.println("Perulangan For");
        for(i = 1; i <= n; i++)
            System.out.print(i + "\t");
        // end for
        
        System.out.println("\nPerulangan While");
        i = 1;
        
        while(i <= n) {
            System.out.println(i + "\t");
            i++;
        }
        
        System.out.println("\nPerulangan Do-While");
        i = 1;
        do {
            System.out.print(i + "\t");
            i++;
        }while(i <= n);
    }
}