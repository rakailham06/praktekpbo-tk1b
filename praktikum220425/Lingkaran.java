/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum220425;

/**
 *
 * @author rakad
 */
public class Lingkaran {
    private double r;
        
    public Lingkaran(){
        
    }
    public Lingkaran(double r){
        this.r=r;
    }
    public void setR(double r){
        this.r=r;
    }
    public double getR(){
        return r;
    }
    public double getDiameter(){
        return 2*r;
    }
    public double getKeliling(){
        return r*Math.PI*2;
    }
    public double getLuas(){
        return r*2*Math.PI;
    }
    public String toString(){
        return "Lingkaran:" +
           "\nJari-jari =  " + r +
           "\nDiameter =  " + getDiameter() +
           "\nKeliling = " + getKeliling() +
           "\nLuas = " + getLuas();
    }
}
