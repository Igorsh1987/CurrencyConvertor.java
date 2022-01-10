import java.util.Scanner;
import Coins.ICalculate;
import Coins.Coin;

public class Main {
    public static void main(String[] args) {

        double num1 = 1.0;
        double num2 = 2.0;

        /* First screen (Welcome Screen) */
        System.out.println("Welcome to currency convertor");
        System.out.println("*****************************");
        System.out.println("Please choose an option (1/2)");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Please enter amount to convert");
                Scanner scannerUSD = new Scanner(System.in);
                double value = scanner.nextDouble();

        }
    }
}




