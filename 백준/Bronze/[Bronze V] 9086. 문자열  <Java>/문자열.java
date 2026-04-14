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
		
		for (int i = 0; i < a; i++) {
			
			String s = sc.nextLine();
			String [] li = s.split("");
			
			System.out.println(li[0]+""+li[ li.length - 1 ]);
		}
		
		
		bw.flush();
		br.close();
	}
}