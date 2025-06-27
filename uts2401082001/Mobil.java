/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401082001;
//Andyta Ilham Rakadiredja 2401082001

public class Mobil extends Kendaraan {

    protected String bahanBakar;
    protected int kapasitasMesin;

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public void display() {
        System.out.println("Mobil");
        super.display();
        System.out.println("Bahan bakar: "+bahanBakar);
        System.out.println("Kapasistas Mesin: "+kapasitasMesin);
    }
}
