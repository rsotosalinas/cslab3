import java.util.EmptyStackException;

public class LinkedQueue<T> implements QueueInterface<T>
{
	private Node front;
	private Node back;
	
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
	public LinkedQueue(){
		front = null;
		back = null;
	}
	
	public void enqueue(T newEntry){
		Node newNode = new Node(newEntry, null);
		if(isEmpty())
			front = newNode;
		else
			back.next = newNode;
		back = newNode;
	}

    public T dequeue(){
    	T first = getFront();
    	front.data = null;
    	front = front.next; 
    	if (front ==null){
    		back = null;
    	}
    	
    	return first;
    }

    public T getFront(){
           if(isEmpty())
        	   throw new EmptyStackException();
           else 
        	   return front.data;
    }

    public boolean isEmpty(){
    	return (front ==null) &&(back == null) ;
    }

   public void clear(){
	   front = null;
	   back = null;
   }

}
