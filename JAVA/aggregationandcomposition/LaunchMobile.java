package aggregationandcomposition;

public class LaunchMobile {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		Charger ch=new Charger("samsung","black");
		m.disp(ch);
		//m=null;
		System.out.println("Mobile destroyed");
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		System.out.println(ch.getBrand());
		System.out.println(ch.getColor());
		

	}

}
