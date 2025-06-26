/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270525;

/**
 *
 * @author rakad
 */
public abstract class AlatMusik implements BisaDinyalakan{
    protected String nama;
    protected String jenis;
    
   public AlatMusik(String nama, String jenis){
       this.nama = nama;
       this.jenis = jenis;
   }
   
   public String getNama(){
       return nama;
   }
   
   public void setNama(String nama){
       this.nama = nama;
   }
   
   public String getJenis(){
       return jenis;
   }
   
   public void setJenis(String jenis){
       this.jenis = jenis;
   }
   
   public void info(){
       System.out.println("Nama: "+nama+", Jenis: "+jenis);
   }
   
   public abstract void mainkan();
   public abstract void stem();
}
