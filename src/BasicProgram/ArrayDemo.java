package BasicProgram;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int ar[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = scanner.nextInt();
        }

        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
