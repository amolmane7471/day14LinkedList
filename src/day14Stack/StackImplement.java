package day14Stack;
import day14Stack.LinkedListStack.Node;
public class StackImplement {
	int top=-1;
	Node head=null;
	LinkedListStack list=new LinkedListStack();
	
	public void push(int data) {
		head=list.insertFirst(data);
		top++;
	}
	public Node pop() {
		top--;
		return list.pop();
	}
	public void printStack() {
		list.displayLinkedList();
		}
	}
