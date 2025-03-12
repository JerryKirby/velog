import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력값을 정수로 변환
        int N = Integer.parseInt(br.readLine());
        
        // StringBuilder를 사용하여 출력 효율성 향상
        StringBuilder sb = new StringBuilder();
        
        // 소인수분해 시작
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }
        
        // 남은 수가 1보다 크면 그 수도 소인수
        if (N > 1) {
            sb.append(N).append("\n");
        }
        
        // 결과 출력
        System.out.print(sb.toString());
        
        // BufferedReader 닫기
        br.close();
    }
}