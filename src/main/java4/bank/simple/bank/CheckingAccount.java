package bank.simple.bank;


import bank.simple.Client;

public class CheckingAccount extends Account {

    CheckingAccount(Client client, double initialAmount) {
        super(client);
        setAmount(initialAmount);
    }

    String printInfo() {
        return "CheckingAccount, " + super.printInfo();
    }
}
