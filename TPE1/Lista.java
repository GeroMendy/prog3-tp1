package TPE01v02;

public class Lista {

	private Nodo first;
	private int size;
	
	public Lista() {
		first=null;
		size=0;
	}
	
	public void add(Comparable info) {
		Nodo aux = new Nodo(first,info);
		first = aux;
		size++;
	}
	public Comparable extractFront() {
		Nodo aux = first;
		first = first.next();
		size--;
		return aux.getInfo();
	}
	public Comparable get(int pos) {
		Nodo aux = first;
		for(int i=1;i<pos;i++) {
			aux = aux.next();
		}
		return aux.getInfo();
	}
	public void remove(int pos) {
		Nodo sig = first.next();
		if(pos==0) {
			first = sig;
		}else {
			Nodo ant=first;
			for(int i=1;i<pos;i++) {
				ant = sig;
				sig = sig.next();
			}
			ant.setNext(sig);
		}
		size--;
	}
	public int getSize() {
		return size;
	}
	public Iterador iterator(){
		return new Iterador(first);
	}
}
