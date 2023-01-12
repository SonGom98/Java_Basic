package ch02.ex01;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = {9,10,12,11,2,7,1,6,5};
		
		BubbleSort bs = new BubbleSort();
		bs.sort(arr1);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		int[] arr2 = {9,10,12,11,2,7,1,6,5};
		
		InsertionSort is = new InsertionSort();
		is.sort(arr2);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
