package DataStructure;

public class Pro2_OrderedList <T extends Comparable> 
{
	
	public class Node <T>
	{	
		T data;
		Node<?> next;   //<?> wildtype
		Node(T data)
		{
			this.data=data;
		}
	}	
		Node<?> head=null;
		Integer top=0;
	
	/*	<T extends Comparable>*/ boolean  add(T obj)
		{	top++;
			Node<?> n=new Node<T>(obj);
			if(head==null)
			{
				head=n;
				return true;
			}
			if(((Comparable) head.data).compareTo(obj)>= 0)
			{
				n.next = head;
				head = n;
				return true;
				
			}
				Node<?> t=head;
			while(t.next!=null)
			{
				if(((Comparable) t.next.data).compareTo(obj)>= 0)
					break;
				
				t=t.next;
			}
			n.next = t.next; 
			t.next=n;
			return true;
		}
		
		void display()
		{
			Node<?> t=head;
			while(t!=null)
			{
				System.out.print(t.data);
				if(t.next!=null)
					System.out.print("->");
				t=t.next;
			}
			System.out.println();
		}
		
		T delete(Integer in)
		{
			try 
			{
				if(in==0)
				{
					T data=(T) head.data;
					head=head.next;
					return data;
				}
				Node<?> t=head;
				while(t.next!=null && in>1)
				{
					t=t.next;
					in--;
				}
				T data=(T) t.next.data;
				if(t.next.next!=null)
					t.next=t.next.next;
				else
					t.next=null;
				return (T) data;
					
				
			}
			catch(Exception e)
			{
				return null;
			}
		}
		
		boolean search(Node<?> head,T string)
		{
			Node<?> current=head;
			while(current!=null)
			{
				if(current.data==string)
					return true;
				current=current.next;
			}
			return false;
		}
		
		
		boolean isEmpty()
		{
			return top<=0;
		}
		
		int size()
		{
			return top;
		}
		
		@SuppressWarnings("unchecked")
		T index(Integer index)
		{
			Node<?> current=head;
			int count=0;
			T c=(T)"";
			while(current!=null)
			{
				if(count==index) {
					c=(T)current.data;
					return c;  
				}
				count++;
				current=current.next;
			}
			assert(false);
			return c;
		}

		
		
		
}
