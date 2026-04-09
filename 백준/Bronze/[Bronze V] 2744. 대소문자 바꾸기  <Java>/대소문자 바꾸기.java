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
		
		String line = sc.nextLine();
		char [] li  = line.toCharArray();
		
		for (char c : li) {
			if (Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
			} else {
				System.out.print(Character.toUpperCase(c));
			}
		}
		
		
		bw.flush();
		br.close();
	}
}