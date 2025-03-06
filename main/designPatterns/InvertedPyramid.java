package main.designPatterns;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}	
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
