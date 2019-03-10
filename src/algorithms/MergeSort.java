package algorithms;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 23, 12, 5, 6, 32, 45, 11 };
		mergeSort(arr, 0, arr.length - 1);
		pirntArray(arr);
	}

	private static void mergeSort(int[] arr, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(arr, first, mid);
			mergeSort(arr, mid+1, last);
  			merge(arr, first, mid, last);
		}
	}

	private static void merge(int[] arr, int first, int mid, int last) {
		//23, 12, 5, 6, 32, 45, 11 
		int fnum = mid-first + 1;
		int lnum = last - mid;
		
		int ftemp[] = new int[fnum];
		int ltemp[] = new int[lnum];
		
		for (int i = 0; i < fnum; i++)
			ftemp[i] = arr[first + i];
		
		for (int j = 0; j < lnum; j++)
			ltemp[j] = arr[mid + 1 + j];
		
		int i = 0, j = 0, k = first;
		
		while (i < fnum && j < lnum) {
			if (ftemp[i] <= ltemp[j]) {
				arr[k] = ftemp[i];
				i++;
			} else {
				arr[k] = ltemp[j];
				j++;
			}
			k++;
		}

		while (i < fnum) {
			arr[k] = ftemp[i];
			i++;
			k++;
		}

		while (j < lnum) {
			arr[k] = ltemp[j];
			j++;
			k++;
		}

	}

	private static void pirntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	/*
	 * private void merge(int[] arr, int first, int middle, int last) { int fn =
	 * middle - first + 1; int ln = last - middle;
	 * 
	 * int[] ftemp = new int[fn]; int[] ltemp = new int[ln];
	 * 
	 * for (int i = 0; i < fn; ++i) ftemp[i] = arr[first + i];
	 * 
	 * for (int j = 0; j < ln; ++j) ltemp[j] = arr[middle + 1 + j];
	 * 
	 * int i = 0, j = 0; int k = first; while (i < fn && j < ln) { if (ftemp[i] <=
	 * ltemp[j]) { arr[k] = ftemp[i]; i++; } else { arr[k] = ltemp[j]; j++; } k++; }
	 * 
	 * while (i < fn) { arr[k] = ftemp[i]; i++; k++;
	 * 
	 * }
	 * 
	 * while (j < ln) { arr[k] = ltemp[j]; j++; k++; }
	 * 
	 * }
	 * 
	 * void mergeSort(int[] arr, int first, int last) { if (first < last) { int
	 * middle = (first + last) / 2;
	 * 
	 * mergeSort(arr, first, middle); mergeSort(arr, middle + 1, last);
	 * 
	 * merge(arr, first, middle, last); } }
	 * 
	 * private static void printArray(int[] arr) { for (int i = 0; i < arr.length;
	 * i++) System.out.print(arr[i]+" "); System.out.println("");
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { int[] arr = {30, 2, 7, 3, 6, 17,1};
	 * System.out.println("Given Array:"); printArray(arr); MergeSort ms = new
	 * MergeSort(); ms.mergeSort(arr, 0, arr.length - 1);
	 * System.out.println("Soreted Array:"); printArray(arr); }
	 */

}
