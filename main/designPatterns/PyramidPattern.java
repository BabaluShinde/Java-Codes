package main.designPatterns;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");		

			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");		//We can Use System.out.print(*); to print the * pattern 
			}
			System.out.println();
		}

	}

}
