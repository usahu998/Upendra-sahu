package newproject;

public class Student extends Human {
	
	public void dispBook(Book b)
	{
		System.out.println(b.getAuthor());
		System.out.println(b.getCost());
	}
	public void dispBike(Bike bi)
	{
		System.out.println(bi.getBrand());
		System.out.println(bi.getColor());
	}

}
