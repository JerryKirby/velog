import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll()); // 앞에서 꺼내 뒤로 보냄
            }
            sb.append(queue.poll()).append(", "); // k번째 사람 제거 후 저장
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
