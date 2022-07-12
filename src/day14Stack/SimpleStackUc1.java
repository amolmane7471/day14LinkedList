package day14Stack;
/*
 * program to create Stack of elements
 */
public class SimpleStackUc1 {
	public static void main(String[] args) {
		/*
		 * object created Stack
		 * push 70 into stack 
		 * push 30 into stack
		 * push 56 into stack 
		 */
		StackImplement stack=new StackImplement();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
	}

}
