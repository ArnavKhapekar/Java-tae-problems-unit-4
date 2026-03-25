import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double amount = sc.nextDouble();

        if (amount > balance)
            throw new ArithmeticException("Insufficient Balance");

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
