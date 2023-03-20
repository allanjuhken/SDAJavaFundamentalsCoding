package part1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            if (i%3==0){
                System.out.println("Fizz");
                continue;
            } else if (i%7 == 0 ) {
                System.out.println("Buzz");
                continue;
            } else if (i%3==0 && i%7==0) {
                System.out.println("Fizz Buzz");
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
