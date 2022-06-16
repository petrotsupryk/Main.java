
// знайти середнє арифметичне елементів, які знаходяться на діагоналях

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int[][] Matrix = new int[m][n];
        Random generator = new Random(); // ств. генератор випадкових чисел
        int gn;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                gn = generator.nextInt(10);
                Matrix[i][j] = gn;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Matrix[i][j] + "    ");
            }

            System.out.println();
        }

        // знайти номер стовбця у якому сума чисел є найменшою
        int sum = 0;
        int minSumColumnIndex = 0;

        for (int i = 0; i < n; i++) {
            int columnSum = 0;
            for (int j = 0; j < m; j++) {
                columnSum += Matrix[j][i];
            }

            if (sum > columnSum || minSumColumnIndex == 0) {
                minSumColumnIndex = i;
                sum = columnSum;
            }
        }

        System.out.println("minSumColumnIndex = " + minSumColumnIndex);

        // знайти номер радка, у якому сума чисел є найбільшою
        int maxSumColumIndex = 0;
        for (int i = 0; i < n; i++) {
            int columSum = 0;
            for (int j = 0; j < m; j++) {
                columSum += Matrix[j][i];
            }
            if (sum < columSum || maxSumColumIndex == 0) {
                maxSumColumIndex = i;
                sum = columSum;
            }
        }
        System.out.println("maxSumColumnIndex = " + maxSumColumIndex);

    }
}