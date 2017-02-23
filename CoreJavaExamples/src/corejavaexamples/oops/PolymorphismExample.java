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
public class PolymorphismExample {
    public static void main(String[] arg)
	{
		//ElectronicDevice ed1=new ElectronicDevice();
		//System.out.println(ed1);
                
                //Virtual Method Invocation
		ElectronicDevice ed=new Television();
		System.out.println(ed);
		ed=new Television();
		System.out.println(ed);
		ed.turnOn();
		ed.turnOff();
		//ed.display();
		Television tv=(Television)ed;	//float f=(float)i; Casting
		tv.display();
		ed=new Mobile();//new Object by changing its form
		System.out.println(ed);
		System.out.println(tv.toString());
	}
}
abstract class ElectronicDevice{
	public abstract void turnOn();
	public abstract void turnOff();
}
class Television extends ElectronicDevice{
	public void turnOn(){
		System.out.println("TV has been turned on");
	}
	public void turnOff(){
		System.out.println("TV has been turned off");
	}
	public void display(){
		System.out.println("TV has displayed Channel 0");
	}
}
class Mobile extends ElectronicDevice{
	public void turnOn(){
		System.out.println("Mobile has been turned on");
	}
	public void turnOff(){
		System.out.println("Mobile has been turned off");
	}
	
}