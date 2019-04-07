package TPE01v02;

public class Diferencia {
	Comparable[]arr;

	public Diferencia() {
		arr=null;
	}

	public Lista getDif(Lista a, Lista b) {
		Lista dif = new Lista();
		arr = new Comparable[b.getSize()]; 
		Iterador it = b.iterator();
		for(int i=0;i<arr.length;i++) {
			arr[i]=it.next();
		}
		it=a.iterator();
		MergeSort merge =new MergeSort();
		merge.sort(arr);
		while(it.hasNext()) {
			Comparable value=it.next();
			if(!existe(value,arr)) {
				dif.add(value);
			}
		}
		return dif;

	}
	private boolean existe(Comparable value,Comparable[]arr) {
		return existe(value,arr,0,arr.length-1);
	}
	private boolean existe(Comparable value,Comparable[]arr,int min, int max) {
		int middle;
		if(max<min)return false;
		else {
			middle=(min+max)/2;
			if(value.compareTo(arr[middle])<0)return existe(value,arr,min,middle-1);
			else if(value.compareTo(arr[middle])>0)return existe(value,arr,middle+1,max);
			else return true;
		}
	}
}
