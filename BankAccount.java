public class BankAccount {
    
    private long balance ;

    public void deposit(long amount){
        balance += amount;
    }

    public void withdraw(long amount){
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public long getBalance(){
        return this.balance;
    }

}
