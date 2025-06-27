/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401082001;

/**
 *
 * @author rakad
 */
public class Sepeda extends Kendaraan{
    protected int jmlSadel;
    protected int jmlGir;
    
    public void setJmlSadel(int jmlSadel){
        this.jmlSadel = jmlSadel;
    }
    
    public int getJmlSadel(){
        return jmlSadel;
    }
    
    public void setJmlGir(int jmlGir){
        this.jmlGir = jmlGir;
    }
    
    public int getJmlGir(){
        return jmlGir;
    }
    
    @Override
    public void display(){
        System.out.println("Sepeda");
        super.display();
        System.out.println("Jumlah Sadel: "+jmlSadel);
        System.out.println("Jumlah Gir: "+jmlGir);
    }
}
