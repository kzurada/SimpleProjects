package bank.simple.bank;


import bank.simple.Client;

public class SavingAccount extends Account {
    SavingAccount(Client client, double initialAmount) {
        super(client);
        setAmount(initialAmount);
    }

    // przeliczenie odsetek
    void computeIntereset(double interestPercent) {
        add(getAmount() * interestPercent);
    }

    String printInfo() {
        return "SavingAccount, " + super.printInfo();
    }
}
