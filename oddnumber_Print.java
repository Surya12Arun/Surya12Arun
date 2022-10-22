// Print numbers from 0 to 10 if it is odd or even

package basic_java;

public class oddnumber_Print {

	public static void main(String[] args) {
		int i;
		for (i=0;i<=10;i++)
		{
			if (i%2!=0) {
				System.out.println(i + "is an odd number");
			}
			else if (i%2==0) {
				System.out.println(i + "is an Even number");
			}
		}

	}

}
