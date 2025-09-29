import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private static Double Balance = 0D;
    private static List<Transaction> transactionList = new ArrayList<>();

    public static void addMoney(Scanner sc) {
        System.out.print("Enter amount to be deposit : ");
        Double money;

        try {
            money = sc.nextDouble();
            sc.nextLine();
            Balance += money;
            Transaction transaction = new Transaction(money, TransactionType.DEPOSIT);
            transactionList.add(transaction);
            System.out.println("$ " + money + " is credited to account. Your new balance : $" + Balance);
        } catch (NumberFormatException e) {
            System.out.println("Enter the valid input number");
        }
    }

    public static void withDrawMoney(Scanner sc) throws InsufficientBalanceException {
        System.out.print("Enter amount to withdraw : ");
        Double money = sc.nextDouble();
        sc.nextLine();
        if (Balance < money) {
            throw new InsufficientBalanceException("Insufficient amount of money");
        } else {
            Balance -= money;
            Transaction transaction = new Transaction(money, TransactionType.WITHDRAW);
            transactionList.add(transaction);
            System.out.println("Withdraw successful " + money + ". New Balance : " + Balance);
        }
    }

    public static void checkBalance() {
        System.out.println("Your current balance : " + Balance);
    }

    public static void checkHistory() {
        if(transactionList == null){
            System.out.println("Your account have not history yet");
            return;
        }
        System.out.println("Your account history ");
        for (Transaction transaction : transactionList) {
            System.out.println(transaction.toString());
        }
    }
}
