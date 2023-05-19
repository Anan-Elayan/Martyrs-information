package Martyrs;

public interface MethodsSingelLinkedList {
	
	
	public abstract NodeSigleLinkedList getFirst() ;
	public NodeSigleLinkedList getLast() ;
	public boolean removeFirst();
	public boolean removeLast();
	public boolean removeAtIndex(int index);
	public boolean removObj(NodeSigleLinkedList target);
	public SingelLinkedList search(String name);
	public void addFirst(NodeSigleLinkedList target);
	public void addLast(NodeSigleLinkedList target) ;
	public void addNode(NodeSigleLinkedList target, int index);
	public void addNodeSorted(NodeSigleLinkedList newNode);
	public void printList();
	public int size();
		

}
