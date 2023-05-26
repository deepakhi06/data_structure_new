package sorting;

import java.util.Arrays;

public class InsertionSort {
	 public static void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int temp=a[i];//Store the first element of the unsorted array
			int j = i-1;
			/*
			 * Compares all the elements one by one from last index till index
			 * 0 from the sorted array and if element from sorted array is greater than
			 * the element which is stored in temp variable then we shift the sorted array's 
			 * element to right side by 1 position
			 */
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;		
			}
			//place the element just after the smaller element in sorted array
			a[j+1] = temp;
		}
		
	}
 public static void main(String[] args) {
	int a[]= {5,4,10,3,9};
	System.out.println("========= Before sorting array is ========="+Arrays.toString(a));
	insertionSort(a);
	System.out.println("========= After sorting array is ========="+Arrays.toString(a));
	
}


}
