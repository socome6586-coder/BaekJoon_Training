import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int sum = a+b;
		int sum2 = a-b;
		int sum3 = a*b;
		int sum4 = a/b;
		int sum5 = a%b;
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
	}
}