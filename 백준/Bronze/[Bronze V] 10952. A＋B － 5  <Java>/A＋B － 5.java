import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 터미널에 입력하기 위한 변수

		while(true) { // while, 무한 반복
			int a = sc.nextInt(); // 입력 변수1
			int b = sc.nextInt(); // 입력 변수2
			int sum = a + b; // 변수 a + b 의 합
			
			if (sum == 0) { // 만약 (sum 이 정수 0과 같다면)
				break; // 이 반복문을 중지한다
			} 
			System.out.println(sum); // sum을 출력
		} 
	}
}