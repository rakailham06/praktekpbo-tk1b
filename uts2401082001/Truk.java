/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401082001;

/**
 *
 * @author rakad
 */
public class Truk extends Mobil{

    protected String muatanMaks;

    public void setMuatanMaks(String muatanMaks) {
        this.muatanMaks = muatanMaks;
    }
    
    public String getMuatanMaks(){
        return muatanMaks;
    }
    
    @Override
    public void display(){
        System.out.println("Truk");
        super.display();
        System.out.println("Muatan Maks: "+muatanMaks);
        
    }
}
