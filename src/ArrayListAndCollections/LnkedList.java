package ArrayListAndCollections;

import java.util.*;

public class LnkedList {
	private int size;

	LnkedList() {
		this.size = 0;
	}

	class Node {
		String data;
		int numb;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}

		Node(int numb) {
			this.numb = numb;
			this.next = null;
			size++;
		}

	}

	public Node head;

	// add - first, Last:

	// ADD FIRST STRING
	public void addStrFirst(String data) {
		Node nNode = new Node(data);

		if (head == null) {
			head = nNode;
			return;
		}
		nNode.next = head;
		head = nNode;

	}

	// ADD FIRST INTEGER
	public void addIntFirst(int numb) {
		Node nNode = new Node(numb);
		if (head == null) {
			head = nNode;
			return;
		}
		nNode.next = head;
		head = nNode;
	}

	// ADD LAST STRING
	public void addLastString(String data) {
		Node nNode = new Node(data);
		if (head == null) {
			head = nNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = nNode;
	}

	// ADD LAST INTEGER
	public void addLastInteger(int numb) {
		Node nNode = new Node(numb);
		if (head == null) {
			head = nNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = nNode;
	}

	// PRINT STRING LIST
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	// PRINT INTEGER LIST
	public void printIntegerList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.numb + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	// DELETE FIRST

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}

	// DELETE LAST
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondlast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondlast = secondlast.next;
		}
		secondlast.next = null;
	}
	
	public int getSize() {
		return size;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LnkedList listS = new LnkedList();
		LnkedList listI = new LnkedList();

		listS.addStrFirst("a");
		listS.addStrFirst("is");

		listS.addLastString("list");
		// listS.addStrFirst("Th");
		listI.addIntFirst(45);
		listI.addIntFirst(20);
		listI.addIntFirst(30);

		// listS.deleteFirst();
//		listI.deleteFirst();
		// listS.printList();
		// listI.printIntegerList();

		listS.addStrFirst("This");
		listS.printList();

		listS.deleteFirst();
		// listS.deleteLast();
		listS.printList();
		System.out.println(listS.getSize());
		System.out.println(listI.getSize());
		listS.addLastString("test");
		System.out.println(listS.getSize());
	}

}
