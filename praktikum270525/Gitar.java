/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270525;

/**
 *
 * @author rakad
 */
public class Gitar extends AlatMusik{
    private int jumlahSenar;
    
    public Gitar(String nama, String jenis, int jumlahSenar){
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }
    
    public int getJumlahSenar(){
        return jumlahSenar;
    }
    
    public void setJumlahSenar(int jumlahSenar){
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+" dipetik dengan "+ jumlahSenar);
    }

    @Override
    public void stem() {
        System.out.println("Menyetem Gitar "+nama+" ");
    }

    @Override
    public void nyalakan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void matikan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean cekListrik() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
