import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 5000.00;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }
}
