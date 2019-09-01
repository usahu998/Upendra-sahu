package Egaggandcomp;

public class LaunchStudent {

	
	public static void main(String[] args) {
       Student s=new Student();
      System.out.println(s.br.getColor());
      System.out.println(s.br.getWeight());
      
      Book bk=new Book("Balaguruswami",700);
      s.hasA(bk);
      s=null;
     System.out.println(bk.getAuthor());
     System.out.println(bk.getCost());
      
	}

}
