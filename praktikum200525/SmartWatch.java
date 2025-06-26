/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author rakad
 */

public class SmartWatch extends Elektronik {
    public SmartWatch(String merek, int tahunProduksi, int garansi) {
        super(merek, tahunProduksi, garansi);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Jenis: SmartWatch");
    }
}
