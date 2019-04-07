package TPE01v02;

import java.util.Iterator;

public class Iterador implements Iterator<Comparable>{
	
	private Nodo nodo;
	
	public Iterador(Nodo first) {
		nodo = first;
	}
	
	public boolean hasNext() {
		return nodo != null;
	}
	public Comparable next() {
		Comparable info = nodo.getInfo();
		nodo = nodo.next();
		return info;		
	}
	public Comparable get() {
		return nodo.getInfo();
	}

}
