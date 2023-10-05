/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PlayerClass;

/**
 *
 * @author zaqiah ahmad
 */
public class game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek player
        Player petani = new Player();
        //mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthpoin = 100;
        
        //menjalankan method
        petani.run();
        
        if(petani.isDead()){
    System.out.println("Game Over!");
    }
}
}

