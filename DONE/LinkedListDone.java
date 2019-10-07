
/*
 * 		COSC 211 (Anthony Bacarella)
 * 			Assignment #9
 * The program should manipulate a singly linked list of numbers.
 * The program will:
 * 1) Give the user the options to add a number to the beginning or the end of the list
 * 2) Display the length of the list
 * 3) Search the list for a specific number
 * 4) Delete a node containing a specific number
 * 5) Print the list
 * The program will loop until the user chooses to quit.
 */

public class LinkedList 	//Linkedlist class
{
	private class Node		//inner node class
	{
		int id;
		Node link;
		
		public Node()
		{
			id = Integer.MIN_VALUE;
			link = null;
		}
		public Node(int x, Node p)
		{
			id = x;
			link = p;
		}
	}
	//end of node class
	
	private Node head;
	public LinkedList()
	{
		head = null;
	}
	
	public void addToStart(int id)	//adds a node to the start of the list
	{
		head = new Node(id,head);
	}
	
	public void addToEnd(int id)
	{
		Node p = head;
		while (p.link != null)	//stops just before final node
		{
			p=p.link;
		}	
		Node q = new Node(id,null);
		p.link = q;	//points the final node's link (was null) to the new node q.
	}
	
	public boolean deleteHeadNode()	//Delete the first node and return true if the list has at least one node
	{
		if (head != null)
		{
			head = head.link;
			return true;
		}
		else
			return false;
	}
	
	public int size()	//returns the amount of nodes in the list
	{
		int count = 0;
		Node position = head;
		
		while (position != null)
		{
			count++;
			position = position.link;
		}
		return count;
	}
	
	public boolean contains (int target)	//returns true if the target int is in the list
	{
		return (find(target) != null);
	}
	
	private Node find (int target)	//finds the first node containing the target and returns the reference to that node
	{
		Node position = head;
		int idAtPosition;
		while (position != null)
		{
			idAtPosition = position.id;
			if(idAtPosition == target)
				return position;
			position = position.link;	
		}
		return null;
	}
	
	public void printList()	//displays the list
	{
		Node position = head;
		while (position != null)
		{
			System.out.print(position.id+" ");
			position = position.link;
		}
	}
	public void deleteNode(int id)
	{
		Node p = head;
		Node q = head;
		while(p.id != id)
		{
			p = p.link;
		}
		while(q.link != p)	//q will traverse the list until it reaches the node preceding the one to be deleted.
		{
			q = q.link;
		}
		q.link = q.link.link;	//links the node to the node following the one we want to delete.
	}
	private void printListRec(Node p)	//recursively prints the list
	{
		if(p != null)
		{
			System.out.print(p.id + " ");
			printListRec (p.link);
		}
	}
	public void printListRecursive()
	{
		printListRec(head);
	}
}