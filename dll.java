package helloworld;

import java.util.Scanner;

public class doublyLinkedList {

	class node {
		int data;
		node next;
		node previous;    

		public node(int data) {
			this.data = data;
			node next = null;
			node previous = null;
		}
	}

	node head = null;

	public void InsertAtBeg(int value) {
		node new_node = new node(value);
		if (head == null) {
			head = new_node;
		} else {
			new_node.next = head;
			head.previous = new_node;
			head = new_node;
			//System.out.println("NODE IS INSERTED!!!");
		}
	}

	public void InertAtLast(int data) {
		node new_node = new node(data);
		if (head == null) {
			head = new_node;
		} else {
			node n = head;
			while (n.next != null) {
				n = n.next;
			}
			new_node.previous = n;
			n.next = new_node;
			//System.out.println("NODE IS INSERTED AT LAST!!!");

		}
	}

	public void InsertedAtPosition(int data) {
		node new_node = new node(data);
		int position = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position to be inserted: ");
		position = sc.nextInt();
		if (head == null) {
			head = new_node;
		} else {
			node n = head;
			for (int i = 0; i < position - 1; i++) {
				n = n.next;
			}
			new_node.previous = n;
			new_node.next = n.next;
			n.next.previous = n;
			n.next = new_node;
		}

	}

	public void DeleteAtFirst() {
		if (head == null) {
			System.out.println("Sorry List is Empty!!!");
		} else {
			head = head.next;
			head.previous = null;
		}
	}

	public void DeleteAtLast() {
		if (head == null) {
			System.out.println("Sorry List is Empty: ");

		} else if (head.next == null) {
			head = null;
		} else {

			node n = head;
			while (n.next != null) {

				n = n.next;
			}
			n.previous.next = null;
		}
	}

	public void DeleteAtPosition() {
		int position = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position to delete: ");
		position = sc.nextInt();
		if (head == null) {
			System.out.println("Sorry List Is Empty!!!");
		} else if (head.next == null) {
			head = null;
		} else {
			node n = head;
			for (int i = 0; i < position; i++) {
				n = n.next;
			}
			n.next.previous = n.next;
			n.previous.next = n.next;

		}
	}

	public void GetLength() {
		if (head == null) {
			System.out.println("SORRY LIST IS EMPTY!!!");
		} else {
			int count = 0;
			node n = head;
			while (n != null) {
				count++;
				n = n.next;
			}
			System.out.println("Total Length of List is " + " " + count);

		}
	}
	public void MiddleElement() 
	{
		if(head==null)
		{
			System.out.println("List is Empty!!!");
		}
		else
		{
			node slow=head;
			node fast=head;
			while(fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			System.out.println("Middle Element is" +" "+slow.data);
		}
		
	}
	public void Search()
	{
		int data;
		int flag = 0;
		node n = head;
		Scanner sc = new Scanner(System.in);
		if (head == null) {
			System.out.println("SORRY LIST IS EMPTY!!!");
		} else {
			System.out.println("Enter the data want to search: ");
			data = sc.nextInt();
			while (n != null) {

				if (n.data == data) {

					flag = 1;
				}
				n = n.next;
			}

			if (flag == 1) {
				System.out.println("Data is  present !!!");

			} else {
				System.out.println("Data is not present !!!");
			}
		}
	}
  public void IsCircular() 
  {
	 node n=head;
	 int flag=0;
	 if(head==null)
	 {
		 System.out.println("List is Empty: ");
	 }
	 else
	 {
     	while(n.next!=null)
	 {
		 if(n.next==null)
	     flag=1;
		 n=n.next;
	 }
	 if(flag==1)
		 System.out.println("This is Circular List: ");
	 
	 else
	 {
		 System.out.println("This is not Circular List");
		 
	 }
	 
  }
  }
	

	public void Display() {
		if (head == null) {
			System.out.println("SORRY !!! LIST IS EMPTY: ");
			return;
		}

		else {
			node n = head;
			System.out.println("List is: ");
			while (n != null) {
				System.out.println(n.data);
				n = n.next;
			}
		}
	}

	public static void main(String[] args) {
		doublyLinkedList list = new doublyLinkedList();
		list.InsertAtBeg(15);
		list.InsertAtBeg(10);
		list.InsertAtBeg(5);
		list.InertAtLast(20);
		list.InertAtLast(25);
		list.InertAtLast(30);
		list.InertAtLast(35);
		list.InertAtLast(40);
		list.Display();
		//list.IsCircular();
		 //list.InsertedAtPosition(20);
		// list.DeleteAtFirst();
		// list.DeleteAtLast();
		// list.DeleteAtPosition();
		// list.Display();
		//list.GetLength();
		//list.MiddleElement();
		
	}

}
