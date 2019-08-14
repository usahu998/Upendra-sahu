package com.bridgelabz.data_structure.utility;

public class Linkedlist 
{
	public static class Node
	{
		
		public String data;
		
		public Node next;
		
		
		
		public Node(String d)
		{
			data = d;
			 next= null;
		}

	}
	
	
	public Node head;
	
	
	public boolean isEmpty()
	{
		if(head == null)
		{
			return true;
		}
		return false;
	}
	
	
	public void add(String data)
	{
		Node new_node = new Node(data);
		if(isEmpty())
		{
			head = new_node;
		}
		else
		{
			Node temp;
			temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	
	public void displayList()
	{
		if(isEmpty())
		{
			System.out.println("None");
		}
		else
		{
			Node temp;
			temp =head;
			while(temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	
	public boolean search(String key)
	{
		if(isEmpty())
		{
			return false;
		}
		else
		{
			Node temp;
			temp = head;
			while(temp.data.compareTo(key) != 0)
			{
				if(temp.next == null)
				{
					break;
				}
				temp = temp.next;
			}
			if(temp.data.compareTo(key) == 0)
			{
				return true;
			}	
		}
		return false;
	}
	
	
	public void remove(String key)
	{
		if(isEmpty())
		{
			System.out.println("can not delete empty list");
		}
		else
		{
			Node p,q;
			p = head; q = head;
			int count = 1;
			while(p.data.compareTo(key) != 0)
			{
				p = p.next;
				count++;
				if(p.next == null)
				{
					break;
				}
			}
			
			if(p.data.compareTo(key) == 0)
			{
				System.out.println("Element found at node " + count );
				if(count == 1)
				{
					head = p.next;
					p.next = null;
					System.out.println("Element deleted: " + p.data);
					count--;
				}
				else
				{
					while(q.next != p)
					{
						q = q.next;
					}
					q.next = p.next;
					p.next = null;
					System.out.println("\nElement deleted: " + p.data);
					count--;
				}
			}
		}
	}
	
	
	public String toString()
	{
		Node temp;
		 temp= head;
		String s = "";
		while(temp != null)
		{
			s = s + temp.data + " ";
			temp = temp.next;
		}
		return s;
	}
	

}
