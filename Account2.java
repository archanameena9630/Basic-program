import java.util.Scanner;
// BankAccount interface with basic methods
interface BankAccount {
    void depositMoney(double amount);
    void withdrawMoney(double amount);
    void checkBalance();
}
class SavingsAccount implements BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public SavingsAccount(String firstName, String lastName, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = initialDeposit;
    }
    public void depositMoney(double amount) {
        balance =balance+amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
    public void withdrawMoney(double amount) {
            balance=balance- amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
            if (amount > balance) {
                System.out.println("sorry.apke pas ettna balance nhi he. Withdrawal failed.");
            } else {
        }
    }
    public void checkBalance() {
        System.out.println(" total Current balance: " + balance);
    }
}
class CurrentAccount implements BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public CurrentAccount(String firstName, String lastName, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = initialDeposit;
    }
    public void depositMoney(double amount) {
        balance =balance+ amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
    public void withdrawMoney(double amount) {
            balance=balance- amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
            if (amount > balance) {
                System.out.println("sorry.apke pass etna current balence nhi he . Withdrawal failed.");
            } else {
        }
    }
    public void checkBalance() {
        System.out.println("total Current balance: " + balance);
    }
}
 class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to  banking system!");
        System.out.println("Do you want to open an account? (Yes/No)");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            System.out.println("Enter 'saving' to open a Savings Account");
            System.out.println("Enter 'current' to open a Current Account");
            String accountType = sc.nextLine();

            System.out.println("Enter your first name:");
            String firstName = sc.nextLine();
            System.out.println("Enter your last name:");
            String lastName = sc.nextLine();
            System.out.println("Enter initial  amount:");
            double Deposit = sc.nextDouble();

            BankAccount account = null;

            if (accountType.equalsIgnoreCase("saving")) {
                account = new SavingsAccount(firstName, lastName, Deposit);
            } else if (accountType.equalsIgnoreCase("current")) {
                account = new CurrentAccount(firstName, lastName, Deposit);
            } else {
                System.out.println("Invalid account type. Exiting.");
                System.exit(0);
            }
            interactWithAccount(sc, account);
        } else {
            System.out.println("Thank you for visiting!");
        }
        sc.close();
    }
    private static void interactWithAccount(Scanner sc, BankAccount account) {
        char userChoice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            userChoice = sc.next().charAt(0);

            switch (userChoice) {
                case '1':
                    System.out.println("Enter amount to deposit:");
                    double d = sc.nextDouble();
                    account.depositMoney(d);
                    break;

                case '2':
                    System.out.println("Enter amount to withdraw:");
                    double w = sc.nextDouble();
                    account.withdrawMoney(w);
                    break;

                case '3':
                    account.checkBalance();
                    break;

                case '4':
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (userChoice != '4');
    }
}

