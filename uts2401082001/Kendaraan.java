/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401082001;
//Andyta Ilham Rakadiredja 2401082001

public class Kendaraan {

    protected int jmlRoda;
    protected String warna;

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }

    public void display() {
        System.out.println("Jumlah Roda: " + jmlRoda);
        System.out.println("Warna: " + warna);
    }
}
