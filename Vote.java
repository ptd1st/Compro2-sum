import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int K = input.nextInt();

        int arr[] = new int[N + 1];

        for (int i = 0; i < K; i++) {
            int vote = input.nextInt();
            arr[vote]++;
        }
        int maxscore = 0;
        int win = 0;
        for (int i = 1; i <= N; i++) {
            if (arr[i] > maxscore) {
                maxscore = arr[i];
                win = i;
            }
        }
        System.out.println(win);
        System.out.println(maxscore);
    }
}
