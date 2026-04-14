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
		int x = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			if (c < x) {
				System.out.print(c+" ");
			}
		}
		
		bw.flush();
		br.close();
	}
}