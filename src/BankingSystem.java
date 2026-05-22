public class BankingSystem{
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client(1, "John Doe", "123 Main Street");
        Client client2 = new Client(2, "Jane Smith", "456 Oak Avenue");
        Client client3 = new Client(3, "Bob Johnson", "789 Pine Road");
        bank.getClientCollection().add(client1);
        bank.getClientCollection().add(client2);
        bank.getClientCollection().add(client3);

        System.out.println("\n===== CLIENTS ADDED =====");
        bank.showClients();
        Account account1 = new Account(1001, client1);
        Account account2 = new Account(1002, client2);
        Account account3 = new Account(1003, client3);
        Saving savingAccount = new Saving(1003, client3, 0.06); // 6% interest

        // Add accounts to bank
        bank.getAccountCollection().add(account1);
        bank.getAccountCollection().add(account2);
//        bank.getAccountCollection().add(account3);
        bank.getAccountCollection().add(savingAccount);

        System.out.println("\n===== ACCOUNTS CREATED =====");
        bank.showAccounts();
        System.out.println("\n===== DEPOSIT OPERATIONS =====");
        bank.deposit(1001, 5000);
        bank.deposit(1002, 3000);
        bank.deposit(1003, 10000);

        System.out.println("\n===== ACCOUNTS AFTER DEPOSIT =====");
        bank.showAccounts();
        System.out.println("\n===== WITHDRAW OPERATIONS =====");
        bank.withdraw(1001, 1500);
        bank.withdraw(1002, 500);
        bank.withdraw(1003, 500);

        System.out.println("\n===== ACCOUNTS AFTER WITHDRAW =====");
        bank.showAccounts();
        System.out.println("\n===== TRANSFER OPERATIONS =====");
        bank.transfer(1001, 1002, 1000);
        bank.transfer(1002, 1003, 500);
        System.out.println("\n===== ACCOUNTS AFTER TRANSFER =====");
        bank.showAccounts();
        System.out.println("\n===== APPLYING INTEREST =====");
        Saving savAcc = (Saving) bank.findAccount(1003);
        if (savAcc != null) {
            savAcc.interest();
        }

        System.out.println("\n===== FINAL ACCOUNT STATUS =====");
        bank.showAccounts();
    }
}