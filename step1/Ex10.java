package JWD.step1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите размер матрицы n*n: ");
        n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (i = 0; i <= n - 1; i++) {
               if (i % 2 == 0) {
                   for (j = 0; j <= n-1; j++) {
                       arr[i][j] = j + 1;
                   }
               } else {
                   for (j = 0; j <= n-1; j++) {
                   arr[i][j] = n-j ;
                   }
               }
         }

            for (i = 0; i <= n - 1; i++) {
                System.out.println();
                for (j = 0; j <= n - 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
}




