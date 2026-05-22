class Bank
{
    private AccountCollection accountCollection;
    private ClientCollection clientCollection;
    Bank()
    {
        accountCollection = new AccountCollection();
        clientCollection = new ClientCollection();
    }
    public Account findAccount(int accNumber)
    {
        if(accountCollection.getAccount(accNumber) == null)
        {
//            System.out.println("Your account was not found");
            return null;
        }
        if(accountCollection.getAccount(accNumber).getNumber() == accNumber)
        {
            return accountCollection.getAccount(accNumber);
        }
        System.out.println("Sorry, Your Account " + accNumber +  " was not created yet");
        return null;
    }
    public void deposit(int accNumber, double amount)
    {
        Account account = findAccount(accNumber);
        if(account!=null)
        {
            account.credit(amount);
            System.out.printf("Amount: %f was deposited to Account: %d\n",amount,accNumber);
        }
    }

    public  void withdraw(int accNumber,double amount)
    {
        Account account = findAccount(accNumber);
        if(account!=null)
        {
            account.debit(amount);
            System.out.printf("Amount: %.2f was withdrawn from Account: %d\n",amount,accNumber);
        }
    }
    public void transfer(int fromAcc,int toAcc,double amount)
    {
        Account sender = findAccount(fromAcc);
        Account reciver = findAccount(toAcc);
        if(sender!=null && reciver!=null)
        {
            sender.debit(amount);
            reciver.credit(amount);
        }
    }
    public void showAccounts()
    {
        System.out.println("================== OUR  BANK ACCOUNTS =================");
        for(Account acc : accountCollection.getAccounts())
        {
            System.out.println("====================================================");
            acc.display();
            System.out.println("====================================================");
        }

    }
    public void showClients()
    {
        System.out.println("================== OUR  BANK CLIENTS =================");
        for(Client client : clientCollection.getClients())
        {
            System.out.println("====================================================");
            System.out.println(client);
            System.out.println("====================================================");
        }
    }

    public ClientCollection getClientCollection() {
        return clientCollection;
    }

    public AccountCollection getAccountCollection() {
        return accountCollection;
    }
}