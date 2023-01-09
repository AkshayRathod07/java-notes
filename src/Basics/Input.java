package Basics;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // take a to number from user  and add 
        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);
        
        System.out.println("Please enter Two number");

        int firstNumberResult = firstNumber.nextInt();
        int secondNumberResult = secondNumber.nextInt();

        // Addition of two no
        int finalResult = firstNumberResult + secondNumberResult;

        System.out.println("Result : " + finalResult);
    }
}
