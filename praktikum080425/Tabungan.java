/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum080425;

/**
 *
 * @author rakad
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah) {
        if (jumlah<=saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
    
    public boolean transfer(Tabungan t, int jumlah) {
        if (ambilUang(jumlah)) {
            t.simpanUang(jumlah);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Saldo: "+saldo;
    }
}

