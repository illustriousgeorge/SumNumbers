import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println("Napič čísla k sečtení, napsáním 0 se čísla sečtou. Čísla odděl enterem.");
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            number = input.nextInt();
            sum+= number;
        } while(number != 0);
        System.out.println("Sum is : " + sum);
    }
}