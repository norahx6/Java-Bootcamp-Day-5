package Day5;

public class Account {

    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }

    public Account(String id, String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        amount=100;
        balance = amount + balance;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance=  balance - amount ;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account a2, int amount) {
        if (amount >= balance) {
            System.out.println(amount);
        } else {
            System.out.println("Amount is exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}// end
