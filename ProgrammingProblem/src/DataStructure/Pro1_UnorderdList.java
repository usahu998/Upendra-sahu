package DataStructure;

public class Pro1_UnorderdList <T>
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
			boolean add(T obj)
			{	top++;
				Node<?> n=new Node<T>(obj);
				if(head==null)
				{
					head=n;
					return true;
				}
				Node<?> t=head;
				while(t.next!=null)
				{
					t=t.next;
				}
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
			
			boolean addFirst(T obj)
			{
				Node<?> n=new Node<T>(obj);
				n.next=head;
				head=n;
				return true;
			}
			
			boolean deleteFirst()
			{
			Node<?> t=head;
			head=head.next;
						return true;
			}
			
			void reverse()
			{
				Node<?> prev=null;
				Node<?> current=head;
				Node<?> next=null;
				
				while(current!=null)
				{
					next=current.next;
					current.next=prev;
					prev=current;
					current=next;
				}
				head=prev;
				
			}
			
			boolean add(T data,Integer in)
			{
				try
				{
					Node<?> n=new Node<T>(data);
					Node<?> t=head;
					
					if(in==0)
					{
						n.next=head;
						head=n;
						return true;
					}
					while(t.next!=null && in>1)
					{
						t=t.next;
						in--;
						
					}
					n.next=t.next;
					t.next=n;
					 return true;
				}
				catch(Exception e)
				{
					return false;
				}
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
			
			void reversedisplay()
			{
				rev(head);
			}
			
			void rev(Node<?> n)
			{
				if(n.next!=null)
				{
					rev(n.next);
				}
				System.out.println(n.data);
			}
			
			boolean search(Node<?> head,T x)
			{
				Node<?> current=head;
				while(current!=null)
				{
					if(current.data==x)
						return true;
					current=current.next;
				}
				return false;
			}
			
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
			
			
			int size()
			{
				return top;
			}
			
			
			boolean isEmpty()
			{
				return top<=0;
			}
			
			  Node<T> pop() 
			    { 
			        if (head == null) 
			            return null; 
			  
			        if (head.next == null)  
			            return null;
					return null; 
			       
			    }
}
