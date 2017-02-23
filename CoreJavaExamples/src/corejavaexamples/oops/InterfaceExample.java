/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.oops;

/**
 *
 * @author iamsu
 */
interface vechile{
    public void move();
}
interface Boat extends vechile{
    public void sail();
}
interface Airplane extends vechile{
    public void fly();
}
//implements Multiple Inheritance
class FlyBoat implements Boat,Airplane {

    @Override
    public void sail() {
        System.out.println("Sail Boat");
    }

    @Override
    public void fly() {
        System.out.println("Fly Boat");
    }

    @Override
    public void move() {
        System.out.println("Move Forward");
    }
}
public class InterfaceExample{
    public static void main(String[] arg){
        FlyBoat f=new FlyBoat();
        f.sail();
        f.move();
        f.fly();
    }
}