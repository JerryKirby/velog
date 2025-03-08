import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력값을 정수로 변환
        int N = Integer.parseInt(br.readLine());
        
        // 1은 첫 번째 층이므로 예외 처리
        if (N == 1) {
            System.out.println(1);
            return;
        }
        
        // 벌집의 층 수 계산
        int layer = 1;  // 층 수
        int range = 1;  // 해당 층까지의 최대 숫자
        
        while (range < N) {
            range += 6 * layer;  // 각 층은 6의 배수로 증가
            layer++;
        }
        
        System.out.println(layer);
        
        // BufferedReader 닫기
        br.close();
    }
}