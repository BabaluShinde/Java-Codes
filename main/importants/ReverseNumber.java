package main.importants;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=128, reverse=0;
				do {
					int digit=num%10;
					reverse=reverse*10 +digit;
					num=num/10;
				}while(num>0); {
					System.out.println("The reverse number is  "+reverse);
					
				}

	}

}
