package Day14LinkedList;
/*
 * Ability to create linked list by adding 30 and 56 to 70
 */
public class LinkedListUc2 {
	public static void main(String[] args) {
		/*
		 * list is the object of linked list
		 * insert element using insertFirst method 
		 */
		LinkedList list=new LinkedList();
		list.insertFirst(70);
		list.displayLinkedList();
		list.insertFirst(30);
		list.displayLinkedList();
		list.insertFirst(56);
		list.displayLinkedList();
	}

}
