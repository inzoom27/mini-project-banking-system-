package simplebankingsystem.com;

import java.util.Scanner;

public class AccountDetails {

	Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AccountDetails acc = new AccountDetails();

        Account user = acc.getAccountDetails();
        int amount = acc.getWithdrawAmount();

        user.withdraw(amount);
    }
    public Account getAccountDetails() {

        Account account = new Account();

        int accountId, balance;
        String accountType;

        System.out.println("Enter account id:");
        accountId = sc.nextInt();

        System.out.println("Enter account type:");
        accountType = sc.next();

        while (true) {
            System.out.println("Enter balance:");
            balance = sc.nextInt();
            if (balance > 0)
                break;
            else
                System.out.println("Balance should be positive");
        }

        account.setAccountId(accountId);
        account.setAccountType(accountType);
        account.setBalance(balance);

        return account;
    }

    public int getWithdrawAmount() {

        int withdrawAmount;

        while (true) {
            System.out.println("Enter amount to be withdrawn:");
            withdrawAmount = sc.nextInt();
            if (withdrawAmount > 0)
                return withdrawAmount;
            else
                System.out.println("Amount should be positive");
        }
    }
}