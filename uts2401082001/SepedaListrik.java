/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401082001;

/**
 *
 * @author rakad
 */
public class SepedaListrik extends Sepeda {

    protected int kecepatanMaks;
    protected int jarakTempuh;

    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setJarakTempuh(int jarakTempuh){
        this.jarakTempuh = jarakTempuh;
    }
    public int getJarakTempuh(){
        return jarakTempuh;
    }
    
    @Override
    public void display(){
        System.out.println("Sepeda Listrik");
        super.display();
        System.out.println("Kecepatan Maks: "+kecepatanMaks);
        System.out.println("Jarak tempuh: "+jarakTempuh);
    }
}
