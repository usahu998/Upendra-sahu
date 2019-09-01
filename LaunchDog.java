class Dog
{
String Name;
String Breed;
int cost;

	void eat()
	{
	 System.out.println("Dog is eating");
	} 
	void bark()
	{
	 System.out.println("Dog is barking bow bow");
	}
	void sleep()
	{
         System.out.println("Dog is sleeping");
	}
}

class LaunchDog
{
	public static void main(String args[])
	{
	Dog d1=new Dog();
	Dog d2=new Dog();
	Dog d3=new Dog();
	
	d1.eat();
	d2.bark();
	d3.sleep();
	}
}