/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayerClass;

/**
 *
 * @author zaqiah ahmad
 */
public class Player {
    //definisi atribut
    String name;
    int speed;
    int healthpoin;
    
    //definisi method run
    void run(){
        System.out.println(name + "is running..");
        System.out.println("speed:" + speed);
    }
    //definisi method isDead untuk mengecek nilai kesehatan (healthpoin)
    boolean isDead(){
        if(healthpoin <=0)return true;
        return false;
    }
}
