/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum180325;

/**
 *
 * @author rakad
 */
public class VehicleEncapsulation {
    private double load;
    private double maxLoad;
    public VehicleEncapsulation(){
        
    }
    public VehicleEncapsulation(double maxLoad){ //constructor
        this.maxLoad = maxLoad;   
    }
    public void setMaxLoad(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
    public boolean addLoad(double weight){
        if((load + weight) < maxLoad){
            this.load = this.load+weight;
            return true;
        }else //load+weight>maxLoad
            return false;
    }
}