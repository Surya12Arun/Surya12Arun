//check odd or even

package basic_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Give the number to be tested");
		int a = scan.nextInt();
		if (a%2==0) {
			System.out.print(a + "is an even number");
		}
			else {
				System.out.println(a + "is an odd number");
			}
		}

	}
