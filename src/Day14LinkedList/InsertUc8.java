package Day14LinkedList;
/*
 * program for inserting the element after two element and before one element 
 */
public class InsertUc8 {
	public static void main(String[] args) {
		/*
		 * list object is created
		 * insert 56 to the list 
		 * display list 
		 */
		LinkedList list=new LinkedList();
		list.insertFirst(56);
		list.displayLinkedList();	
		/*
		 * append 30 after 56 to  the list
		 * display list 
		 * append 70 after 30
		 */
		list.append(30);
		list.displayLinkedList();
		list.append(70);
		list.displayLinkedList();//56 30 70
        list.insertBetween(30, 40);
        list.displayLinkedList();//56 30 40 70
	}

}
