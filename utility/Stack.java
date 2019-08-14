package com.bridgelabz.data_structure.utility;

public class Stack <T>
{
	LinkedList ls=new LinkedList();
	Node head;
	static int top;
	static Object[] arr;
	public static int size;

	public Stack(int n)
	{
		top=-1;
		size=n;
		arr=new String[n];
	
	}
	boolean isEmpty()
	{
		return (top<0);
	}
	
	public class Node<T>
	{
		T data;
		T next;
		
		Node(T new_data)
		{
			data=new_data;
			next=null;
		}
	}
//	public void print()
//	{
//		Node<T> temp=head;
//		
//		System.out.println("linkedlist:");
//		while(temp!=null)
//		{
//			
//			System.out.println(temp.data);
//			temp=temp.next;	
//			
//		}
//		
//		
//	}
	
	public boolean push(T new_data)
	{
		//Node new_node=new Node(new_data);
		if(top>size)
		{
			System.out.println("stack overflow");
			return false;
		}
		
		else
		{
		
			arr[++top]=ls.push(new_data);
			//new_node.next=arr[top];
			
			System.out.print(" "+arr[top]);
			return true;
		}
		
		//head=new_node;
		
	}
	public <T> Object pop()
	{	
		Node temp=head;
		Object s;
		if(top < 0)
		{
			System.out.println("stack underflow");
			return null;
		}
		else
		{
		  s=arr[top--];
		 System.out.print(" "+s);
		return s;
		}
		//return null;
		
		//return null;
		
	}

}
