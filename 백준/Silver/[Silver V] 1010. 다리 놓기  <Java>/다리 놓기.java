import java.util.Scanner;

public class Main {
    static int[][] dp = new int[31][31];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            System.out.println(comb(M, N));
        }
    }

    static int comb(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        
        return dp[n][r] = comb(n-1, r-1) + comb(n-1, r);
    }
}