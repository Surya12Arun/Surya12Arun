// Count the odd numbers and even numbers separately from 1 to 100

package basic_java;

public class Countnumbers {

	public static void main(String[] args) {
		int oddcount=0;
		int evencount=0;
		int oddsum=0;
		int evensum=0;
		int i;
			for(i=1;i<=100;i++) {
		if (i%2!=0) {
			oddcount++;
			oddsum+=i;
		}
		else if (i%2==0) {
			evencount++;
			evensum+=i;
		} 
	}
			System.out.println("Number of odd numbers are " +oddcount);
			System.out.println("The sum of odd numbers are " +oddsum);
			System.out.println("Number of even numbers are " +evencount);
			System.out.println("The sum of even numbers are " +evensum);
}
}
