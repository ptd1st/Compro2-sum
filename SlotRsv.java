import java.util.Scanner;

public class SlotRsv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int K = input.nextInt();
        int P = input.nextInt();
        int arra[] = new int[N + 1];
        int arrb[] = new int[N + 1];

        for (int i = 0; i < P; i++) {
            int vote = input.nextInt();
            if (arra[vote] < K) {
                arra[vote]++;
                System.out.println("1");
            } else {
                arrb[vote]++;
                System.out.println("2");
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arra[i] + " ");

        }
        System.out.println();
        for (int i = 1; i <= N; i++) {
            System.out.print(arrb[i] + " ");
        }
    }
}