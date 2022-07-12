package Day14LinkedList;
/*
 * Ability to create linkedlist by appending 30 and 70 to 56
 * append method insert new element next to the first element
 */
public class LinkedListUc3 {
	public static void main(String[] args) {
		/*
		 * list object created
		 */
		LinkedList list=new LinkedList();
		list.insertFirst(56);
		list.displayLinkedList();
		list.append(30);
		list.displayLinkedList();
		list.append(70);
		list.displayLinkedList();
	}

}
