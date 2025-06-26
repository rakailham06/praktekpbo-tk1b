/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum220425;

/**
 *
 * @author rakad
 */
public class Silinder extends Lingkaran{
    private double tinggi;
    
    public Silinder(){
        super();
    }
    public Silinder(double r, double t){
        super.setR(r);
        this.tinggi=t;
    }
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        double r=super.getR();
        return Math.PI*r*r*tinggi;
    }
    @Override
    public String toString(){
        return"Silinder: "+
                "\nJari-jari = "+getR()+
                "\nDiameter = "+getDiameter()+
                "\nTinggi = "+getTinggi()+
                "\nVolume = "+getVolume()+
                "\nLuas = "+getLuas();
    }
    @Override
    public double getLuas() {
        double r = getR();
        return 2 * Math.PI*r*(r+tinggi);
    }
}
