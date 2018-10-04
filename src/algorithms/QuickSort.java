package algorithms;

public class QuickSort {

	int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j <high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return i + 1;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i]);
	}

	void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivot = partition(array, low, high);
			quickSort(array, low, pivot - 1);
			quickSort(array, pivot + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] array = { 10, 80, 30, 90, 40, 50, 70 };
		QuickSort qsort = new QuickSort();
		qsort.quickSort(array, 0, array.length - 1);
		System.out.println("Sorted Array:");
		printArray(array);
	}

}
