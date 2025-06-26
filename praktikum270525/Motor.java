/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270525;

/**
 *
 * @author rakad
 */
public class Motor extends Kendaraan {
    private String jenisHelm;
    private int cc;
    
    public Motor(String merk, int tahun, String jenishelm, int cc){
        super(merk, tahun);
        this.jenisHelm = jenishelm;
        this.cc = cc;
    }
    
    public String getJenisHelm(){
        return jenisHelm;
    }
    
    public void setJenisHelm(String jenisHelm){
        this.jenisHelm = jenisHelm;
    }
    
    public int getCc(){
        return cc;
    }
    
    public void setCc(int cc){
        this.cc = cc;
    }

    @Override
    public void nyalakan() {
        System.out.println("Motor "+merk+" dinyalakan dengan starter.");
    }

    @Override
    public void matikan() {
        System.out.println("Motor "+merk+" dimatikan.");
    }

    @Override
    public void info() {
        System.out.println("Motor "+merk+", Tahun "+tahun+", Jenis Helm "+jenisHelm+
                ", "+cc+" cc");
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Periksa rantai, oli, mesin, dan rem motor "+merk+".");
    }

    @Override
    public void servis() {
        System.out.println("Motor "+merk+" perlu servis rutin");
    }
}
