import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine()); // 입력 개수
        int[] count = new int[10001]; // 1부터 10,000까지의 수를 카운팅하기 위한 배열
        
        // 입력받아서 카운팅
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }
        
        // 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        
        System.out.print(sb.toString());
        br.close();
    }
}