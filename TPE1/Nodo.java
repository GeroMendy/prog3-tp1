package TPE01v02;

public class Nodo {
	
	private Nodo next;
	private Comparable info;

	public Nodo(Nodo next,Comparable info) {
		this.next = next;
		this.info = info;
	}
	
	public void setInfo(int info) {
		this.info = info;
	}
	public void setNext(Nodo next) {
		this.next = next;
	}
	public Comparable getInfo() {
		return info;
	}
	public Nodo next() {
		return next;
	}
	public boolean hasNext() {
		return next!=null;
	}
}
