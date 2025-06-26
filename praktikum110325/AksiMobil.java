/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum110325;

/**
 *
 * @author rakad
 */
public class AksiMobil {
    public static void main(String[] args){
        //buat object baru
        Mobil toyota=new Mobil();
        toyota.merk="Toyota";
        toyota.plat="BA 1234 L";
        toyota.tahun=2004;
        toyota.warna="Hitam";
        System.out.println("--------------");
        System.out.println("Data Mobil 1 : ");
        System.out.println("Merk Mobil = "+toyota.merk);
        System.out.println("Plat Mobl = "+toyota.plat);
        System.out.println("Warna Mobil = "+toyota.warna);
        System.out.println("Tahun Keluaran = "+toyota.tahun);
        System.out.println("Suara Mobil = "+toyota.SuaraMobil());
        ///pemanggilan method
        toyota.MobilAktif();//tanpa return(
        System.out.println(toyota.SuaraMobil());
        
        Mobil avanza=new Mobil();
        avanza.merk="Avanza";
        avanza.plat="BA 4567 W";
        avanza.tahun=2006;
        avanza.warna="Silver";
        System.out.println("--------------");
        System.out.println("Data Mobil 2 = ");
        System.out.println("Merk Mobil = "+avanza.merk);
        System.out.println("Plat Mobil = "+avanza.plat);
        System.out.println("Warna Mobil = "+avanza.warna);
        System.out.println("Tahun keluaran Mobil = "+avanza.tahun);
        ///pemanggilan method
        avanza.MobilAktif();//tanpa return(
        System.out.println(avanza.SuaraMobil());
    }
}
