package Day14LinkedList;
/*
 * program for delete the last element in the linked list
 */
public class DeleteLastUc6 {
	public static void main(String[] args) {
		/*
		 * object list is created
		 * insert 56 to the list
		 * append 70 after the 56
		 * insert 30 between 56 and 70
		 * popLast delete last element i.e.70
		 */
		LinkedList list=new LinkedList();
		list.insertFirst(56);
		list.displayLinkedList();//56
		list.append(70);
		list.displayLinkedList();//56 70
		list.insertBetween(56, 30);
		list.displayLinkedList();//56 30 70
        list.popLast(); 
        list.displayLinkedList();//56 30
	}
}
