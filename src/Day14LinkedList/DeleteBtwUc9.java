package Day14LinkedList;
/*
 * program for deleting element between 1st and last elements
 */
public class DeleteBtwUc9 {
	public static void main(String[] args) {
	/*
	 * object list created
	 * insert 56 to the list 
     * display list 
     * append 30 after 56 to  the list
     * display list 
	 * append 70 after 30
	 * insert 40 between 30 and 70
	 * delete 40
	 */
		LinkedList list=new LinkedList();
		list.insertFirst(56);
		list.displayLinkedList();//56
		list.append(30);
		list.displayLinkedList();//56 30
		list.append(70);
		list.displayLinkedList();//56 30 70
		list.insertBetween(30, 40);
		list.displayLinkedList();//56 30 40 70
        list.delete(40);
        list.displayLinkedList();//56 30 70
	}

}
