package com.bridgelabz.data_structure.utility;

public class Dequeue <T> 
{
	public static int capacity = 100;
	public static String[] str = new String[capacity];
	public static int front = -1, rear = -1;
	
	
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1)
		{
			return true;
		}
		return false;
	}
	
	
	public boolean isFull()
	{
		if(rear == str.length)
		{
			return true;
		}
		return false;
	}
	
	
	public T addFront(String item)
	{
		if(isFull())
		{
			System.out.println("deque is full");
		}
		else
		{
			if(isEmpty())
			{
				front++;
				str[front] = item;
				rear++;
			}
			else
			{
				for(int i = rear+1; i >= front; i--)
				{
					str[i+1] = str[i];
				}
				str[front] = item;
				rear++;
			}
		}
		return null;
	}
	
	public T addRear(String item)
	{
		if(isFull())
		{
			System.out.println("deque is full");
		}
		else
		{
			if(isEmpty())
			{
				front++;
				rear++;
				str[rear] = item;
			}
			else
			{
				rear++;
				str[rear] = item;	
			}
			
		}
		return null;
	}
	
	
	public String removeRear()
	{
		if(isEmpty())
		{
			return "deque is empty";
		}
		else
		{
			String rearElement = str[rear];
			rear--;
			if(front > rear)
			{
				front = -1;
				rear = -1;
			}
			return rearElement;
		}
	}
	
	
	public String removeFront()
	{
		if(isEmpty())
		{
			return "deque is empty";
		}
		else
		{
			String frontElement = str[front];
			front++;
			if(front > rear)
			{
				front = -1;
				rear = -1;
			}
			
			return frontElement;
		}
	}
	
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("deque is empty");
		}
		else
		{
			for(int i = front; i <= rear; i++)
			{
				System.out.println(str[i]);
			}
		}
	}
	

	public int size()
	{
		if(isEmpty())
		{
			return 0;	
		}
		else
		{
			int length = rear - front +1;
			
			return length;
		}
	}
	
	
	public String toString()
	{
		String result = "";
		result = "";
		for(int i = front; i <= rear; i++)
		{
			result = result + str[i];
		}
		
		return result;
	}

}
