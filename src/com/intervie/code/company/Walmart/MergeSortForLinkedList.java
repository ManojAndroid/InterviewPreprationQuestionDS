package com.intervie.code.company.Walmart;

public class MergeSortForLinkedList {
	static class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;

	Node sortMerg(Node a, Node b) {
		Node result = null;
		if (a == null)
			return b;
		if (b == null)
			return a;
		if (a.data <= b.data) {
			result = a;
			result.next = sortMerg(a.next, b);
		} else {
			result = b;
			result.next = sortMerg(a, b.next);
		}
		return result;

	}

	Node mergeSort(Node h) {
		if (h == null | h.next == null)
			return h;
		Node middle = getMiddle(h);
		Node middletiNext = middle.next;
		middle.next = null;

		Node left = mergeSort(h);

		Node right = mergeSort(middletiNext);

		Node result = sortMerg(left, right);
		return result;
	}

	Node getMiddle(Node node) {
		if (node == null)
			return node;
		Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
        }
		return slow_ptr;

	}
	void push(int value)
	{
		Node newNode=new Node(value);
		newNode.next=head;
		head=newNode;
		
		
	}
	 void printList(Node headref) 
	    { 
	        while (headref != null) { 
	            System.out.print(headref.data + " "); 
	            headref = headref.next; 
	        } 
	    }
	
		
	public static void main(String[] args) {
		MergeSortForLinkedList li = new MergeSortForLinkedList(); 
	        /* 
	         * Let us create a unsorted linked list to test the functions 
	         * created. The list shall be a: 2->3->20->5->10->15 
	         */
	        li.push(15); 
	        li.push(10); 
	        li.push(5); 
	        li.push(20); 
	        li.push(3); 
	        li.push(2); 
	  
	        // Apply merge Sort 
	        li.head = li.mergeSort(li.head); 
	        System.out.print("\n Sorted Linked List is: \n"); 
	        li.printList(li.head); 
	    } 
	}

