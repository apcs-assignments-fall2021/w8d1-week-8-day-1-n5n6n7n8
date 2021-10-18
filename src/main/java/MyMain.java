import java.sql.SQLOutput;
import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        return (int) (Math.random()*11) + 10;
    }
    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1, 2));
        System.out.println(Mathey.max(1.2, 5.2));
        System.out.println(Mathey.max(5,8,10));
        System.out.println(Mathey.max(0.01,1.4,8.8, 9.0));
        System.out.println("Mathey.randomInteger tests");
        for (int i = 0; i < 20; i++) {
            System.out.print(Mathey.randomInteger(20,30) + ", ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(Mathey.randomInteger(8) + ", ");
        }
        System.out.println("Mathey.pow tests");
        System.out.println(Mathey.pow(2,4));
        System.out.println(Mathey.pow(5,3));
        System.out.println("Mathey.abs tests");
        System.out.println(Mathey.abs(5));
        System.out.println(Mathey.abs(-5));
        System.out.println("Mathey.round tests");
        System.out.println(Mathey.round(2.3));
        System.out.println(Mathey.round(2.4));
        System.out.println(Mathey.round(2.5));
        System.out.println(Mathey.round(2.6));
        System.out.println("Mathey.floor tests");
        System.out.println(Mathey.floor(2.45));
        System.out.println(Mathey.floor(2.99999));
        System.out.println("Mathey.ceil tests");
        System.out.println(Mathey.ceil(2.45));
        System.out.println(Mathey.ceil(2.99999));
    }
}