import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        int range = 2;

        if(range == 1) {
            System.out.println(1);
        } else {
            while(range <= n) {
                range = range + (6*count);
                count++;
            }
        }

        System.out.println(count);
    }
}