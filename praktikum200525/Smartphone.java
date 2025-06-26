/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author rakad
 */

public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    public Smartphone(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera) {
        super(merek, tahunProduksi, garansi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
        System.out.println("Jumlah Kamera: " + jumlahKamera);
    }
}
