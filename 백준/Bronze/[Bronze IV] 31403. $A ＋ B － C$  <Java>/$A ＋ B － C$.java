import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner        sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b - c;
		String a2 = Integer.toString(a);
		String b2 = Integer.toString(b);
		
		String a2b2 = a2 + b2;
		int ab = Integer.parseInt(a2b2);
		System.out.println(sum);
		System.out.println(ab - c);
		
		
		bw.flush();
		br.close();
	}
}