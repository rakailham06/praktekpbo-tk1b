/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum110325;

/**
 *
 * @author rakad
 */
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    //constrcutor
    public Kendaraan(String j, String m, int t, String w){
        this.jenis=j;
        this.merk=m;
        this.tahun=t;
        this.warna=w;
    }
    
    //method tanpa parameter
    public void InfoKendaraan(){
        System.out.println("\n\t---DATA KENDARAAN---");
        System.out.println("Jenis Kendaraan = "+jenis);
        System.out.println("Merk Kendaraan = "+merk);
        System.out.println("Tahun Keluar = "+tahun);
        System.out.println("Warna Kendaraan = "+warna);
    }
    
    //method dengan parameter
    public void CekHarga(int harga){
        System.out.println("Harga Sewa Kendaraan = Rp."+harga);
    }
    
    public void CekKendaraan(int v){
        if(v>=20 && v<=40){
            System.out.println("Kecepatannya Slow");
        }else if(v>40 && v<=60){
            System.out.println("Kecepatannya Average");
        }else if(v>60 && v<=85){
            System.out.println("Kecepatannya Fast");
        }else if(v>85){
            System.out.println("Kecepatannya Racing");
        }else{
            System.out.println("Mending jalan saja");
        }
    }
}