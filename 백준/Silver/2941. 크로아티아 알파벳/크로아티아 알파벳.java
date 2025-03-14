import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        // 크로아티아 알파벳 배열
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        // 크로아티아 알파벳을 하나씩 체크하면서 변환
        for (String cro : croatian) {
            input = input.replace(cro, "A"); // 크로아티아 알파벳을 한 글자(A)로 치환
        }
        
        // 최종 문자열 길이가 답
        System.out.println(input.length());
    }
}
