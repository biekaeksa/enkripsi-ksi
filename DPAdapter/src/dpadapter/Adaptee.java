/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpadapter;

/**
 *
 * @author faisa
 */
public class Adaptee {
    public  void draw(int x, int y, int w, int h){
        System.out.println("Rectangle dengan titik : ("+ x + ", "+ y +", "+ w + ", " + h +")");
    }
}
