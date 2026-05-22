public class Saving extends Account {
    private double interestRate=0.0;
    private Client owner;
    // Constructor with parameters
    public Saving(int number, Client owner, double interestRate) {
        super(number, owner);
        this.owner = owner;
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest
    public void interest() {
        double interestAmount = this.balance * this.interestRate;
        this.balance += interestAmount;
        System.out.println("Interest of " + interestAmount + " added to account " + number);
        System.out.println("New balance: " + this.balance);
    }

}