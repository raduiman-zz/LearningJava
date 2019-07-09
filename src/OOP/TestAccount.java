package OOP;

class Account {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
    }

    void withdraw(float amt) {
        if (amt > amount) {
            System.out.println("Insufficient balance.");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(1, "Radu", 4536);
        a1.display();
        a1.checkBalance();
        a1.deposit(6000);
        a1.checkBalance();
        a1.withdraw(2400);
        a1.checkBalance();
        }
    }


