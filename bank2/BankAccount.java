package bank2;

public class BankAccount {
    private double balance=10000.5;

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){

        BankAccount obj=new BankAccount();
        System.out.println(obj.getBalance());
    }
}
