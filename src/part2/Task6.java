package part1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        float sum= 0;
        for (int i=1; i<=n; i++){
            sum = sum + (float) 1/i;
        }
        System.out.println(sum);
    }
}
