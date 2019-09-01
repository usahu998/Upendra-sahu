
public class constructor {

	private String name;
	private String address;
	private int age;
	private int rollno;
	public constructor(String name,String address,int age,int rollno)
	{this.name=name;
	this.address=address;
	this.age=age;
	this.rollno=rollno;
	}
public String getName(){
	return name;
}
public String getAddress(){
	return address;
}
public int getAge(){
	return age;
}
public int getRollno(){
	return rollno;
}
}