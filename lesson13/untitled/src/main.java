class Main {
        public static void main(String[] args) {
            System.out.println("------------------------------------------------------------");
            //Transfer 
            System.out.println("Transfer :");
            Account a = new Account(1000);
            Account b = new Account(200);
            a.transfer(500, b);
            System.out.println("Account A after the transfer takes place "+a.getBalance());
            System.out.println("Account B after the transfer takes place "+b.getBalance());
            // interest
            System.out.println("------------------------------------------------------------");

            System.out.println("Interest: ");
            SavingsAccount c = new SavingsAccount(100, 5);
            System.out.println("Before adding interest "+c.getBalance());
            c.addInterest();
            System.out.println("After adding interest "+c.getBalance());
            System.out.println("------------------------------------------------------------");
            System.out.println("Current Account: ");
            CurrentAccount d = new CurrentAccount(2000, 2000);
            d.withdraw(2000);
            d.getBalance(); 
            d.withdraw(5000);
            d.getBalance();
            d.withdraw(300);
            d.getBalance();
System.out.println("------------------------------------------------------------");
            //savings account
            System.out.println("Savings Account");
            Account e = new SavingsAccount(1000, 5);
            e.deposit(100);
            System.out.println("After Deposit "+ e.getBalance());
            e.withdraw(500);
            System.out.println("After Withdraw "+ e.getBalance());
            System.out.println("------------------------------------------------------------");

            //current account
            System.out.println("Current Account : ");
            Account f = new CurrentAccount(2000 , 100);
            System.out.println("Amount of money in the account "+f.getBalance());
            f.deposit(100);
            System.out.println("Amount of money in the account "+f.getBalance());
            f.withdraw(500);
            System.out.println("------------------------------------------------------------");
    }
}