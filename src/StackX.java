//Andre Barajas
//CECS 328
//Summer 2018
//This program implements an undirected graph and 
//includes operations such as Depth First Search 

public class StackX 
{
	private final int SIZE = 20;
	private int[] st;
	 private int top;
	 
	 public StackX()
	 {
		 st = new int[SIZE];
		 top  = -1; 
	 }//End Stack default Constructor 
	 //placing item on stack
	 public void push(int j) {st[++top] = j;}
	 //return element on top of stack 
	 public int pop() { return st[top--];}
	 //View top element
	 public int peek() {return st[top];}
	 public boolean isEmpty() { return (top == -1); } 
	 
}//Ending StackX class
