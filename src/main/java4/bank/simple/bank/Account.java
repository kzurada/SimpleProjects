package bank.simple.bank;


import bank.simple.Client;

abstract class Account {
    // właściciel rachunku
    private final Client client;
    private double amount;

    Account(Client client) {
        this.client = client;
    }

    double getAmount() {
        return amount;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }

    Client getClient() {
        return client;
    }

    void add(double amountToAdd) {
        this.amount += amountToAdd;
    }

    void subtract(double amountToSubtract) {
        this.amount -= amountToSubtract;
    }

    String printInfo() {
        return "Owner: " + client.printInfo() + ", amount=" + amount;
    }
}
