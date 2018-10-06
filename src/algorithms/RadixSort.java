package algorithms;

import java.util.Arrays;

public class RadixSort {

	private int getMax(int[] arr, int length) {
		int max = arr[0];
		for (int i = 1; i < length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	private void countSort(int[] arr, int n, int exp) {
		int output[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;
		
		for (i = 1; i < 10; i++)
			count[i] += count[i-1];
		
		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
		    count[(arr[i] / exp) % 10]--;}
		
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}
	void radixSort(int[] arr, int length) {
		int m = getMax(arr, length);
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, length, exp);

	}
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");

	}

	public static void main(String[] args) {
		int arr[] = { 127, 10, 30, 4, 89, 95, 143 };
		RadixSort rs = new RadixSort();
		rs.radixSort(arr, arr.length);
		printArray(arr);
	}

}
