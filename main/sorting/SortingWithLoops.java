package main.sorting;

public class SortingWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is a defined sized array example
		
		int[] arr = {4,6,2,16,9,1};
		
	for(int i=0; i<arr.length; i++) {
		
		for(int j=i+1; j<arr.length; j++) {
			
			int temp=0;
			
			if(arr[j]<arr[i]) {
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
		}
		System.out.print(arr[i]+" ");

	}

	}

}
