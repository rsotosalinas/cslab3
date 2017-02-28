import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T>
{
	private Node topNode;
	private int numberOfEntries = 0;
	private class Node{
		private T data; 
		private Node next;
		
		private Node(T data){
			this(data, null);
		}
		private Node(T data, Node nextNode){
			this.data = data;
			next= nextNode;
		}
	}
	public void push(T newEntry){
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
		numberOfEntries++;
	}

	   
	public T pop(){
		T first = peek();
		
		   first = topNode.data;
		   topNode = topNode.next;
		   numberOfEntries--;
	   return first;
	}
	 
	public T peek(){
	   if(isEmpty()){
		  throw new EmptyStackException();
	   }
	   else
		   return topNode.data;
	}
	
    public boolean isEmpty(){
    	return topNode==null;
	}
	  
	public void clear(){
		   topNode = null;
	}
	public T[] lookAll() {
		@SuppressWarnings("unchecked")
		T[] array = (T[])new Object[numberOfEntries];
		int index = 0;
		Node temp = topNode;
		while(index < numberOfEntries && temp != null) {
			array[index] = temp.data;
			temp = temp.next;

			index++;
			
		}
			return array;
    }
} 
