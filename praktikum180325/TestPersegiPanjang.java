/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum180325;

/**
 *
 * @author rakad
 */
public class TestPersegiPanjang {
    public static void main(String[] args){
        System.out.println("Banyak objek awal = "+PersegiPanjang.getJumlahObjek());
        //buat objek pertama dengan constructor kosong
        PersegiPanjang PP1 = new PersegiPanjang();
        PP1.panjang = 5;
        PP1.lebar = 3;
        System.out.println("Banyak objek setelah PP1 = "+PersegiPanjang.getJumlahObjek());
        System.out.println("Luas = "+PP1.panjang+" * "+PP1.lebar+" = "+PP1.getLuas());
        System.out.println("Keliling = 2 * ("+PP1.panjang+" + "+PP1.lebar+") = "+PP1.getLuas());
        
        //buat objek kedua dengan constructor yang memiliki parameter
        PersegiPanjang PP2 = new PersegiPanjang(15,4);
        System.out.println("\nBanyak objek setelah PP2 = "+PersegiPanjang.getJumlahObjek());
        System.out.println("Luas = "+PP2.panjang+" * "+PP2.lebar+" = "+PP2.getLuas());
        System.out.println("Keliling = 2 * ("+PP2.panjang+" + "+PP2.lebar+") = "+PP2.getLuas());  
    }
}
