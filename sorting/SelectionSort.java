package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {6,7,5,4,3};
		System.out.println("========= Before sorting array is ========="+Arrays.toString(a));
		selectionSort(a);
		System.out.println("========= After sorting array is ========="+Arrays.toString(a));
		
	}

	public static void selectionSort(int[] a) {
		int length = a.length;
		for(int i=0;i<length-1;i++) {//Outer loop  is here used for the total no of Iteration or passes
			int min=i;//Store the first element of unsorted array for every pass
			for(int j=i+1;j<length;j++) {//Inner loop
				//Compare the all elements one by one in unsorted array 
				//with the element present at ith index
				if(a[j]<a[min]) {
					min=j;//Update the min variable if unsorted array contains the minimum element
				}
			}
			//swapping the element which are present at ith index and latest min index
			swap(a,i,min);
		}
	}

	/*
	 * we are using third variable temp to swap the value below
	 */
	private static void swap(int[] a, int i, int min) {
		
		int temp =a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}
}
