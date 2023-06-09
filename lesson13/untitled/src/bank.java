class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void transfer(double amount, Account other) {
        if (amount >= this.balance) {
            System.out.println("Error: Transfer exceeds balance.");
            return;
        }
  
        this.withdraw(amount);
        other.deposit(amount);
        
    }
    public double getBalance() {
        return this.balance;
    }}
class SavingsAccount extends Account {
    private double interest;
    public SavingsAccount(double balance, double interest) {
        super(balance);
        this.interest = interest;
    }
    public void addInterest() {
        this.deposit(this.getBalance() * (this.interest / 100));
        
    }}
class CurrentAccount extends Account {
    private double limit;
    public CurrentAccount(double balance, double limit) {
        super(balance);
        this.limit = limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
    public void withdraw(double amount) {
             if ( amount > this.limit) {
            System.out.println("Error: Withdrawal exceeds limit. Because your limit is " + this.limit + " and you are trying to withdraw " + amount + ".");
            return;
        }
        if (amount - this.getBalance() > 0) {
            System.out.println("Error: Transfer balance must be positive. Because your balance is " + this.getBalance() + " and you are trying to withdraw " + amount + ".");
        } else {
            super.withdraw(amount);
            System.out.println("Amount of money withdrawn "+ amount +" Remaining balance: " + this.getBalance());
        }}}
