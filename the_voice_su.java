import java.util.Scanner;

public class the_voice_su {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int K = input.nextInt();

        int pp1 = 0;
        int pp2 = 0;

        for (int i = 1; i <= N; i++) {
            int sex = input.nextInt();
            int score1 = input.nextInt();
            int score2 = input.nextInt();
            if (score1 >= 9 && score2 >= 9) {
                // เหลือคู่
                if (pp1 < K && pp2 < K) {
                    if (sex == 1) {
                        pp1++;
                        System.out.println(i + " " + "1");
                    } else {
                        pp2++;
                        System.out.println(i + " " + "2");
                    }
                }
                // เหลือคน 1
                else if (pp1 < K) {
                    pp1++;
                    System.out.println(i + " 1");
                }
                // เหลือคน 2
                else if (pp2 < K) {
                    pp2++;
                    System.out.println(i + " 2");
                }

            }
            // รับแค่คน 1
            else if (score1 >= 9) {
                if (pp1 < K) {
                    pp1++;
                    System.out.println(i + " 1");
                }
            }
            // รับแค่คน 2
            else if (score2 >= 9) {
                if (pp2 < K) {
                    pp2++;
                    System.out.println(i + " 2");
                }
            }
        }
    }
}