package Day14LinkedList;
/*
 * Insert a element between two elements using insertBetween method 
 */
public class InsertBetweenUc4 {
	public static void main(String[] args) {
		/*
		 * create a object list 
		 */
		LinkedList list=new LinkedList();
		/*
		 * insert 1st element
		 */
		list.insertFirst(56);
		list.displayLinkedList();
		/*
		 * append element 70 to the next of 56 
		 */
		list.append(70);
		list.displayLinkedList();
		/*
		 * insert 30 next to the 56
		 */
		list.insertBetween(56, 30);
		list.displayLinkedList();

	}

}
