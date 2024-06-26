import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int result = n;

        while(true) {
            n = ((n%10)*10) + (((n/10)+(n%10))%10);
            cnt++;

            if(n == result) break;
        }

        System.out.println(cnt);
    }
}