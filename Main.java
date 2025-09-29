import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InsufficientBalanceException{
        Scanner scan = new Scanner(System.in);
        // Create

        System.out.println("Hello Sir, Bank Account Simulation");
        mainLoop: while(true){
            System.out.println();
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Check balance");
            System.out.println("4. Transaction history");
            System.out.println("5. Exit");
            System.out.print("Choose from 1 to 5 : ");
            int choice;
            try{
                choice = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input! Please enter valid integer ");
                continue;
            }

             switch (choice) {
                case 1 -> Account.withDrawMoney(scan);
                case 2 -> Account.addMoney(scan);
                case 3 -> Account.checkBalance();
                case 4 -> Account.checkHistory();
                case 5 -> {
                    break mainLoop;
                }
                default -> System.out.println("Invalid input!!");
            }
        }
    }
}