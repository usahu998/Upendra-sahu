package newproject;

public class LaunchHuman {

	
	public static void main(String[] args) {
         Student s = new Student();
         System.out.println(s.B.getColor());
         System.out.println(s.B.getWeight());
         System.out.println(s.H.getColor());
         System.out.println(s.H.getWeight());
         
         Book b=new Book("balaguruswami",700);
         s.dispBook(b);
         Bike bi=new Bike("Honda","yellow");
         s.dispBike(bi);	
         
	}

}
