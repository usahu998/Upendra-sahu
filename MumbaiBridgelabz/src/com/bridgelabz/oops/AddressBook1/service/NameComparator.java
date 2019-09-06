package test1.AddressBooknew.com.bridgeit.service;

import java.util.Comparator;

import test1.AddressBooknew.com.bridgeit.model.Person;


@SuppressWarnings("rawtypes")
public class NameComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
	
		Person person1=(Person)o1;
		Person person2=(Person)o2;
		
		return person1.getLastname().compareTo(person2.getLastname());
	}


}
