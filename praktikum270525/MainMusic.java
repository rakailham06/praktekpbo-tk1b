/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum270525;

/**
 *
 * @author rakad
 */
public class MainMusic {
    public static void main(String[] args) {
        Gitar gitar = new Gitar("Gitar Klasik", "Petik", 6);
        Keyboard keyboard = new Keyboard("Yamaha PSR", "Elektronik", true);
        
        System.out.println("--- INFO GITAR ---");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println();
        
        System.out.println("--- INFO KEYBOARD ---");
        keyboard.info();
        keyboard.mainkan();
        keyboard.stem();
    }
}
