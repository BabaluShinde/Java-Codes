package main.designPatterns;

public class RightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");	//We can Use System.out.print(j); to print the number pattern.
			}
			System.out.println();
		}
	}

}
