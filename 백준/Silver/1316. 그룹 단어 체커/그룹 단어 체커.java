import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어 개수 입력
        int count = 0; // 그룹 단어 개수

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    private static boolean isGroupWord(String word) {
        boolean[] used = new boolean[26]; // 알파벳 26개에 대한 등장 여부
        char prev = '\0'; // 이전 문자 초기화

        for (char c : word.toCharArray()) {
            int index = c - 'a'; // 알파벳 인덱스 (0 ~ 25)

            // 이전 문자와 다르고, 이미 사용된 문자라면 그룹 단어 아님
            if (c != prev && used[index]) {
                return false;
            }

            // 현재 문자를 사용 표시
            used[index] = true;
            prev = c; // 이전 문자 갱신
        }
        return true;
    }
}