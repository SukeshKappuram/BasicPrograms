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
public class OverridingExample {
    public static void main(String args[])
	{
		
		Vehicle v= new Vehicle();
		v.start();
		v.move();
		Car c=new Car();
                c.start();
		c.move();
		Bike b= new Bike();
		b.start();
		b.move();	
	}
}
class Vehicle
{
	void start()
	{
		System.out.println("vehicle starts");
	}
	void move()
	{
		System.out.println("vehicle is moving");
	}
}
class Car extends Vehicle
{
	public void start()
	{
		System.out.println("Car starts");
	}	
	public void move()
	{
		System.out.println("car is moving");
	}
}
class Bike extends Vehicle
{
	public void start()
	{
		System.out.println("Bike starts");
	}	
	public void move()
	{
		System.out.println("Bike  is moving");
	}
}
