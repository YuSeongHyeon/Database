package report03;
import java.util.NoSuchElementException;

public class CNode <E>{
	private E item;
	private CNode next;
	
	public CNode(E newItem, CNode p) {
		item = newItem;
		next = p;
	}
	
	public E getItem() {return item;}
	public CNode getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(CNode newNext) {next = newNext;}
	
		
	

}


	


