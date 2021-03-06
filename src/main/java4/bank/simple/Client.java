package bank.simple;


import bank.simple.bank.CheckingAccount;
import bank.simple.bank.SavingAccount;

public class Client extends cars.simple.Client {
    private final String name;
    private int age;
    private String address;
    private CheckingAccount checkingAccount;
    private SavingAccount savingAccount;

    public Client(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public String printInfo() {
        return name + ", " + age + " years old";
    }
}
