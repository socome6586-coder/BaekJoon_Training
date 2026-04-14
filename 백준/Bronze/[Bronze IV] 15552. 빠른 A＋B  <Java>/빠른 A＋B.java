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
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String l     = br.readLine();
			String [] li = l.split(" ");
			int a        = Integer.parseInt(li[0]);
			int b        = Integer.parseInt(li[1]);
			int c = a + b;
			bw.write(c+"\n");
		}
		
		bw.flush();
		br.close();
	}
}