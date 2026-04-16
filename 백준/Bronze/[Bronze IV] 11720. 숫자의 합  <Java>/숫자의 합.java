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
		sc.nextLine();
		String s = sc.nextLine();
		
		char [] c = s.toCharArray();
		
		int sum = 0;
		for (char d : c) {
			sum += Character.getNumericValue(d);
		}
		
		System.out.println(sum);
		
		bw.flush();
		br.close();
	}
}