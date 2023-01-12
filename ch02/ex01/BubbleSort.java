package ch02.ex01;

public class BubbleSort implements MySort {

	@Override
	public void sort(int[] arr) { //버블 정렬 로직 구현 {1,7,3,5,4}
		
		for(int i=0; i<arr.length-1; i++) { // 전체 리스트
			for(int j=0; j<arr.length-1-i; j++) { //정렬된 리스트 제외
				if(arr[j] > arr[j+1]) {
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
