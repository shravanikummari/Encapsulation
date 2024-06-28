public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
class BanAccountTest{
    public static void main(String[] args) {
        BankAccount account=new BankAccount("728890481", "SHravani",938920.00);
        System.out.println("account Number: " +account.getAccountNumber());
        System.out.println("account holder name:" + account.getAccountHolderName());
        System.out.println("initial balance:" + account.getBalance());

        account.deposit(28374.0);
        System.out.println("Updated Balance after Deposit: $" + account.getBalance());

        account.withdraw(8494.0);
        System.out.println("Updated Balance after Withdrawal: $" + account.getBalance());

        account.withdraw(5798.0);

        account.deposit(-6870.0);

        account.withdraw(-8490.0);

        // Test setter methods
        account.setAccountNumber("0987654321");
        account.setAccountHolderName("shravani");
        System.out.println("Updated Account Number: " + account.getAccountNumber());
        System.out.println("Updated Account Holder Name: " + account.getAccountHolderName());
    }
}