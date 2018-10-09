import java.util.Random;
import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner input = new Scanner(System.in);
        int[][] arr;
        int n;
        System.out.print("nhập số");
        n = input.nextInt();
        arr = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0; j < n; j ++){
                int number1 = rd.nextInt(2);
                arr[i][j] = number1;
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}

