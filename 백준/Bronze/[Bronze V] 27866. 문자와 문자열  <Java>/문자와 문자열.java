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
		
		String s = sc.nextLine();
		int i = sc.nextInt();
		i--;
		
		String [] li = s.split("");
		System.out.println(li[i]);
		
		bw.flush();
		br.close();
	}
}