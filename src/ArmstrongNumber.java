import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check if it's Armstrong number or not");
		int n = s.nextInt();
		int m=n;
		int c=0, a,temp;
		
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);			
		}
		
		if(temp==c) {
			System.out.println(m+" is a Armstrong Number");
		}
		else {
			System.out.println(m+" is not a Armstrong Number");
		}
	}

}
