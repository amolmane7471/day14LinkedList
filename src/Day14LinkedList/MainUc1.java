package Day14LinkedList;
/*
 * create a simple linked list
 * creating object of linked list
 */
public class MainUc1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		/*
		 * insertFirst method adding a single element to the linked list
		 * displayLinkedList method displays the elements of list
		 */
		list.insertFirst(70);
		list.insertFirst(30);
		list.insertFirst(56);
		list.displayLinkedList();
	
		}
	}
