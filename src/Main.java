// оголосити двовимірний масив 10х10,

// знайти номер радка, у якому сума чисел є найбільшою,
// знайти середнє арифметичне елементів, які знаходяться на діагоналях

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int[][] Matrix = new int[m][m];
        Random generator = new Random(); // ств. генератор випадкових чисел
        int gn;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                gn = generator.nextInt(10);
                Matrix[i][j] = gn;
            }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(Matrix[i][j] + "    ");
            System.out.println();
        }
        // знайти номер стовбця у якому сума чисел є найменшою
        int sum = 0;
        int min = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += Matrix[i][j];
            }
            System.out.println("Suma elementiv " + i + " ryadka " + sum);
        }
        if (sum < min)
            min = sum;
        System.out.println("Sum min " + sum);
    }

}

