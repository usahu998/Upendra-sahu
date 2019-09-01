class Stud
{
String name;
String address;
int rollno;
int age;

	void study()
	{
	 System.out.println("Student is studying");
	}
	void play()
	{
	 System.out.println("Student is Playing");
	}
	void dance()
	{
	 System.out.println("Student is dancing");
	}
}

class Student
{
	public static void main(String args[])
	{
	 Stud s1=new Stud();
	 Stud s2=new Stud();
         Stud s3=new Stud();

	 s1.study();
	 s2.play();
	 s3.dance();
	 new Stud().play();
	
	}


}