import java.util.Scanner;

public class competition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int teamA = 0;
        int teamB = 0;
        int pp = input.nextInt();
        int[] arrA = new int[pp];
        int[] arrB = new int[pp];

        for (int i = 0; i < pp; i++) {
            int n = input.nextInt();
            arrA[i] = n;
            // arrA[i] = input.nextInt(); เหมือนกันแค่เขียนคนละแบบ
        }
        for (int i = 0; i < pp; i++) {
            int n = input.nextInt();
            arrB[i] = n;
            // arrB[i] = input.nextInt(); เหมือนกันแค่เขียนคนละแบบ
        }
        for (int i = 0; i < pp; i++) {
            if (arrA[i] > arrB[i]) {
                teamA += 2;
            } else if (arrA[i] < arrB[i]) {
                teamB += 2;
            } else {
                teamA += 1;
                teamB += 1;
            }
        }
        if (teamA > teamB) {
            System.out.println("Team 1 wins");
            System.out.println("Score" + " " + teamA + " " + "to" + " " + teamB);
        } else if (teamB > teamA) {
            System.out.println("Team 2 wins");
            System.out.println("Score" + " " + teamB + " " + "to" + " " + teamA);
        } else {
            System.out.println("Draw game");
            System.out.println("Score" + " " + teamA + " " + "to" + " " + teamB);
        }
    }
}
