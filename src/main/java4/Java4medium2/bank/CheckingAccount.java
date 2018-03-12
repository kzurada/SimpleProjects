package Java4medium2.bank;


import Java4medium2.Client;

public class CheckingAccount extends Account {

    CheckingAccount(Client client, double initialAmount) {
        super(client);
        setAmount(initialAmount);
    }

    String printInfo() {
        return "CheckingAccount, " + super.printInfo();
    }
}
