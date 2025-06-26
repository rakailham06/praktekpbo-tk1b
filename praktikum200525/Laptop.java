/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author rakad
 */

public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int ram;

    public Laptop(String merek, int tahunProduksi, int garansi, int ukuranLayar, int ram) {
        super(merek, tahunProduksi, garansi);
        this.ukuranLayar = ukuranLayar;
        this.ram = ram;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("RAM: " + ram + " GB");
    }
}
