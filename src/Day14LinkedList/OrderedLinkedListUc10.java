package Day14LinkedList;
/*
 * program to create order linked list in ascending order
 */
public class OrderedLinkedListUc10 {
	public static void main(String[] args) {
		/*
		 * create a object list
		 * using sortList method arrange the list in ascending order
		 */
	SortedLinkedList list = new SortedLinkedList();
	/*
	 * sortList method sorting the element
	 */
	list.sortList(90);
	list.sortList(56);
	list.sortList(30);
	list.sortList(40);
	list.sortList(70);
	list.displaySortedLinkedList();

	}
}
