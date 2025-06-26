/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270525;

/**
 *
 * @author rakad
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String transmisi;
    
    public Mobil(String merk, int tahun, int jumlahPintu, String transmisi){
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }
    
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    
    public String getTransmisi(){
        return transmisi;
    }
    
    public void setTransmiisi(String transmisi){
        this.transmisi = transmisi;
    }

    @Override
    public void nyalakan() {
        System.out.println("Mobil "+merk+" dinyalakan dengan starter.");
    }

    @Override
    public void matikan() {
        System.out.println("Mobil "+merk+" dimatikan.");
    }

    @Override
    public void info() {
        System.out.println("Mobil "+merk+", Tahun "+tahun+", Jumlah Pintu "+jumlahPintu+", Transmisi "+transmisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Periksa oli, rem, dan tekanan ban mobil "+merk+ ".");
    }

    @Override
    public void servis() {
        System.out.println("Mobils "+merk+" perlu servis rutin");
    }
}
