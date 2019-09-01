class Fan
{
String name;
String model;
int cost;

	void on()
	{
	 System.out.println("Fan is on");
	}
	void off()
	{
	 System.out.println("Fan is Off");
	}


}

class FanRun
{
	public static void main(String args[])
	{
	 Fan f1=new Fan();
	 Fan f2=new Fan();

	 f1.on();
	 f2.off(); 
	}


}