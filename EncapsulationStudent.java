
public class EncapsulationStudent {

	public static void main(String[] args) {
		Student1 stu=new Student1();      //student1 class ka object bnaye hai stu
		stu.setName("upendra sahu");      //setName me ek argument bheje hai String type
		stu.setSchool("nirmala sahool");
		stu.setAddress("ring road risdi korba");
		stu.setRollnumber(33);          //setRollnumber me ek argument bheje hai int type
		stu.setMobilenumber(99999);
		stu.setDob(1995);
      
		System.out.println(stu.getName());     //set.Name ye string value ko print karata hai
		System.out.println(stu.getSchool());
		System.out.println(stu.getAddress());
		System.out.println(stu.getRollnumber());
		System.out.println(stu.getMobilenumber());
		System.out.println(stu.getDob());
	}

}
