import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = input.nextInt();
        System.out.print("Pentagonal Number is: " + getPentagonalNumber(n));
    }
    public static int getPentagonalNumber (int n) {
        int pentagonalNumber = 1;

        while (n > 0) {
            pentagonalNumber = n * (3 * n - 1) / 2;
            return pentagonalNumber;
        }
        return pentagonalNumber;
    }
}
