import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N 입력 받기
        int N = Integer.parseInt(br.readLine());
        
        // 팩토리얼 계산 결과 출력
        System.out.println(factorial(N));
        
        // BufferedReader 닫기
        br.close();
    }
    
    // 팩토리얼을 계산하는 함수 (재귀 사용)
    public static long factorial(int n) {
        if (n <= 1) return 1; // 0!과 1!은 1
        return n * factorial(n - 1);
    }
}