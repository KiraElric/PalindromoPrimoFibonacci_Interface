import java.util.Scanner;

import com.nisum.java.model.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Validator prime = new Prime();
            Validator palindrome = new Palindrome();
            Validator fibbonacci = new Fibonacci();
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            System.out.println("The number " + prime.validate(number) + ", " + palindrome.validate(number) + ", " + fibbonacci.validate(number));
        } catch (Exception error){
            System.out.println("Ups!...The entered value is not a number....");
        }
    }
}
