package day14Stack;
/*
 * program to peak and pop from stack till it is empty
 * use Linked list to do the stack operations
 * push for inserting element
 * pop for delete element
 */
public class StackPopUc2 {
	public static void main(String[] args) {
		/*
		 * create a object stack
		 */
		StackImplement stack=new StackImplement();
		/*
		 * add 70 to the bottom of stack
		 * add 30 over the 70
		 * add 56 top of the stack
		 */
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
		/*
		 * pop 56 first
		 * pop 30
		 * pop 70
		 */
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
	}

}
