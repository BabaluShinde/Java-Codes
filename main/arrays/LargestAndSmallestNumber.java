package main.arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {4,5,10,6,2,18};
	
	int min=arr[0],max=arr[0];
	
	for(int num : arr) {    //for each element in.
		if (num<min) {
			min=num;
		}
		if (num > max) {
			max=num;	
		}
	}
	
	System.out.println("Minimum number from the array : "+min);
	System.out.println("Maximum number from the array : "+max);

	}

}
