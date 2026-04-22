import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] Num = new int[N];
        for(int i = 0 ; i <N ; i++){
            int Number = input.nextInt();
            Num[i] = Number;
        }
        for(int i = N-1; i>=0 ; i--){
            System.out.print(Num[i] + " ");
        }
    }
}
