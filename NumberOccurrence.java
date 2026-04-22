import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];
        boolean check = false;

        for(int i = 0 ; i < arr.length ; i++){
            int Number = input.nextInt();
            arr[i] = Number;
        }
        int target = input.nextInt();
        for(int i = 0 ; i< arr.length ;i++){
            if (arr[i]==target) {
                System.out.print(i+1 + " ");
                check = true;
            }
        }
        if (check != true) {
            System.out.println("0");
        }
    }
}
