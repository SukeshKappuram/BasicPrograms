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
public class AbstractionExample {
    public static void main(String args[])
	{
		//Animal a= new Animal();
                Cat c= new Cat();
		c.eat();
                c.sleep();
		Dog d= new Dog();	
                d.eat();
                d.sleep();
	}
}
abstract class Animal
{
	abstract void eat();
	abstract void sleep();
}

class Cat extends Animal
{
        //Overriding Mandatory
	public void eat()
	{
		System.out.println("cat is eating");
	}
	public void sleep()
	{
		System.out.println("cat is sleeping");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog  is eating");
	}
	public void sleep()
	{
		System.out.println("Dog  is sleeping");
	}
}