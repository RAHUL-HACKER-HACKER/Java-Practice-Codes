package EclipseJavaCodes;

class Node
{
	public int data;
	public Node next;
	Node(int i)
	{
		data = i;
		next = null;
	}
}

class LL
{
	private Node HEAD;
	
	LL()
	{
		HEAD = null;
	}

	void insert(int item)
	{
		Node n = new Node(item);
		if(HEAD==null)
		{
			HEAD = n;
		}
		else
		{
			Node x = HEAD;
			while(x.next!=null)
			{
				x=x.next;
			}
			x.next=n;
		}
	}

	void display()
	{
		Node n = HEAD;
		if(n==null)
		{
			System.out.println("The list is empty");
			return;
		}
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data);
		System.out.println();
	}
}

class LinkedList
{
	public static void main(String[] args)
	{
		LL l = new LL();
		l.display();
		l.insert(5);
		l.display();
		l.insert(6);
		l.display();
		l.insert(7);
		l.display();
		
	}
}