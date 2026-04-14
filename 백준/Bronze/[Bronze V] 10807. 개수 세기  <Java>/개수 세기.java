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
		
		int n = sc.nextInt();
		int [] li = new int[n];
		for (int i = 0; i < li.length; i++) {
			li[i] = sc.nextInt();   
		}
		
		int m = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < li.length; i++) {
			if (li[i] == m)
				cnt++;
		}
		System.out.println(cnt);
		
		
		bw.flush();
		br.close();
	}
}