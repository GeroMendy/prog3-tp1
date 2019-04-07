package TPE01v02;

public class MergeSort {

	private Comparable[] values;
	private Comparable[] aux;
	private int size;

	public void sort(Comparable[]arr) {
		values = arr;
		size=values.length;
		aux=new Comparable[size];
		mergeSort(0,size-1);
	}
	private void mergeSort(int min,int max) {
		if(min<max) {
			int middle = (min+max)/2;
			mergeSort(min,middle);
			mergeSort(middle+1,max);
			merge(min,middle,max);
		}
	}
	private void merge(int min,int middle, int max) {
		for (int i = min; i <= max; i++) {
			aux[i] = values[i];
		}
		int i = min;
		int j = middle + 1;
		int k = min;
		Comparable[]helper=null;
		helper = aux;

		while (i <= middle && j <= max) {
			if (helper[i].compareTo(helper[j])<=0) {
				values[k] = helper[i];
				i++;
			} else {
				values[k] = helper[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			values[k] = helper[i];
			k++;
			i++;
		}
		while (j <= max) {
			values[k] = helper[j];
			k++;
			j++;
		}

	}
}
