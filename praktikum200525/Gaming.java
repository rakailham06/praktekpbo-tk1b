/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author rakad
 */
public class Gaming extends Laptop {
    private boolean rgbKeyboard;

    public Gaming(String merek, int tahunProduksi, int garansi, int ukuranLayar, int ram, boolean rgbKeyboard) {
        super(merek, tahunProduksi, garansi, ukuranLayar, ram);
        this.rgbKeyboard = rgbKeyboard;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("RGB Keyboard: " + (rgbKeyboard ? "Ya" : "Tidak"));
    }
}
