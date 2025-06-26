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
public class Pola1 {
    public static void main(String[] args){
        int i, j, n;
        
        Scanner in = new Scanner (System.in);
        System.out.print("n = ");
        n = in.nextInt();
        
        System.out.println("\nPola 1 : ");
        for(i=0; i<n; i++){
            for(j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        System.out.println("\nPola 2 : ");
        for(i=n; i>0; i--){
            for(j=i; j>0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        System.out.println("\nPola 3 : ");
        int a=0;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                a++;
                System.out.print(+a+"\t");
            }
            System.out.println();
        }
        
        System.out.println("\nPola 4 : ");
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(+a+"\t");
                a--;
            }
            System.out.println();
        }
    }
}
