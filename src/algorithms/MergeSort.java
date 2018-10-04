package algorithms;

public class MergeSort {

	private void merge(int[] arr, int first, int middle, int last) {
		int fn = middle - first + 1;
		int ln = last - middle;

		int[] ftemp = new int[fn];
		int[] ltemp = new int[ln];

		for (int i = 0; i < fn; ++i)
			ftemp[i] = arr[first + i];
		
		for (int j = 0; j < ln; ++j)
			ltemp[j] = arr[middle + 1 + j];
		
		int i = 0, j = 0;
		int k = first;
		while (i < fn && j < ln) {
			if (ftemp[i] <= ltemp[j]) {
				arr[k] = ftemp[i];
				i++;
			} else {
				arr[k] = ltemp[j];
				j++;
			}
			k++;
		}

		while (i < fn) {
			arr[k] = ftemp[i];
			i++;
			k++;

		}

		while (j < ln) {
			arr[k] = ltemp[j];
			j++;
			k++;
		}

	}

	void mergeSort(int[] arr, int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2;
			
			mergeSort(arr, first, middle);
			mergeSort(arr, middle + 1, last);
			
			merge(arr, first, middle, last);
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("");

	}

	public static void main(String[] args) {
		int[] arr = {30, 2, 7, 3, 6, 17,1};
		System.out.println("Given Array:");
		printArray(arr);
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr, 0, arr.length - 1);
		System.out.println("Soreted Array:");
		printArray(arr);
	}

}
