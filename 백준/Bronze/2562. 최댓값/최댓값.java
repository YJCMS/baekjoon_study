import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int index = 0;
        for(int i = 1; i < 10; i++) {
            int a =Integer.parseInt(br.readLine());
            if(max < a) {
                max = a;
                index = i;
            }
        }
        sb.append(max).append('\n').append(index).append('\n');
        System.out.println(sb);
    }
}