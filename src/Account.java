class Account{
    protected long number;
    protected double balance;
    protected Client Owner;
    public void credit(double amount)
    {
        balance+=amount;
        System.out.println("Amount was credited...");
    }
    Account(long number , Client owner)
    {
//        super();  // ← ADD THIS LINE
        this.number = number;
        this.Owner  = owner;
    }
    public void debit(double amount)
    {
        if(balance>0 && balance>amount)
        {
            balance-=amount;
            System.out.printf("amount %.2f was debited so account balance %.2f\n",amount,this.balance);
        }
        else
        {
            System.out.println("Insufficient account balance. your balance is " + this.balance);
        }
    }

    public long getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Client getOwner() {
        return Owner;
    }

    public void display()
    {
        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
    }
}
