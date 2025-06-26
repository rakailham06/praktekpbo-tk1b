/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum220425;

/**
 *
 * @author rakad
 */
public class Kerucut extends Lingkaran {
    private double tinggi;
    
    public Kerucut(){
        super();
    }
    public Kerucut(double r, double t){
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
        return (1.0 / 3)*Math.PI*r*r*tinggi;
    }
    @Override
    public String toString(){
        return "Kerucut: "+
                "\nJari-jari = "+getR()+
                "\nDiameter = "+getDiameter()+
                "\nTinggi = "+getTinggi()+
                "\nVolume = "+getVolume()+
                "\nLuas = "+getLuas();
    }
    @Override
    public double getLuas() {
        double r = getR();
        double s = Math.sqrt(r*r+tinggi*tinggi);
        return Math.PI*r*(r+s);
    }
}
