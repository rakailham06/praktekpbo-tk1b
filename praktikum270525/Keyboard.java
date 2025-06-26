/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270525;

/**
 *
 * @author rakad
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;
    
    public Keyboard(String nama, String jenis, boolean dayaTersambung){
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+" dimainkan dengan menekan tuts.");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+" sistem digital melalui aplikasi.");
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+" dinyalakan.");
        } else{
            System.out.println(nama+" tidak bisa dinyalakan.");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama+" dimatikan");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }
}
