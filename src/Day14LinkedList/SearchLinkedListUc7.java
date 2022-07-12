package Day14LinkedList;
/*
 * program for searching a node from a linked list
 */
public class SearchLinkedListUc7 {
	public static void main(String[] args) {
		/*
		 * create a object list
		 * using findNode method search the element 30
		 */
		LinkedList list=new LinkedList();
		list.insertFirst(30);
		list.insertFirst(70);
		list.insertFirst(56);
		list.findNode(30);
		list.displayLinkedList();
	}
}