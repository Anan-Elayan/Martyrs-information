package Martyrs;

public class NodeSigleLinkedList implements Comparable<NodeSigleLinkedList> {

	private Martyrs objMartyrs;
	private NodeSigleLinkedList next;

	public NodeSigleLinkedList() {
		super();
	}
	public NodeSigleLinkedList(Martyrs objMartyrs) {
		super();
		this.objMartyrs = objMartyrs;
	}

	public Martyrs getObjMartyrs() {
		return objMartyrs;
	}

	public void setObjMartyrs(Martyrs objMartyrs) {
		this.objMartyrs = objMartyrs;
	}

	public NodeSigleLinkedList getNext() {
		return next;
	}

	public void setNext(NodeSigleLinkedList next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "MartyrsNode [objMartyrs=" + objMartyrs + "]";
	}

	@Override
	public int compareTo(NodeSigleLinkedList o) {
		return this.objMartyrs.getName().compareToIgnoreCase(((NodeSigleLinkedList)o).objMartyrs.getName());
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return this.objMartyrs.equals(((NodeSigleLinkedList)obj).getObjMartyrs());
	}
	
	
}
