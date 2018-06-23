package ObjectOriented;

import java.util.LinkedList;

public class LinkedListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Lt=new LinkedList<String>();
		Lt.add("Rajesh");
		Lt.add("Test");
		Lt.add("Grow");
		System.out.println("Contents of linkedlist: "+Lt);
		Lt.addFirst("MyFirst");
		Lt.addLast("MyLast");
		System.out.println("New Contents of LinkedList: "+Lt);
	}
}
