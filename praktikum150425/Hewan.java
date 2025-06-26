/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum150425;

/**
 *
 * @author rakad
 */
public class Hewan {
    protected String nama;
    
    public Hewan(String nama) {
        this.nama=nama;
    }
    
    public void Suara() {
        System.out.print("Suara Hewan...");
    } 
    
    public void tampilkanNama() {
        System.out.println("Nama Hewan "+nama);
    }
}
