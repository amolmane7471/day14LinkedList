package Day14LinkedList;
/*
 * for deleting 1st element of linked list pop method used
 */
public class DeleteFirstUc5 {
	public static void main(String[] args) {
		/*
		 * creating object 
		 */
		LinkedList list=new LinkedList();
		/*
		 * insert element  start of linked list
		 * append method adding element to the next of previous element
		 * insert the element between two elements
		 */
		list.insertFirst(56);  
		list.displayLinkedList(); //56
		list.append(70); 
		list.displayLinkedList(); //56 70 
		list.insertBetween(56, 30);
		list.displayLinkedList();//56 30 70
        list.pop(); 
        list.displayLinkedList();//30 70
	}
}
