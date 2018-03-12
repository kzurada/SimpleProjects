package bank.simple.bank;

// przelew zewnętrzny
class ExternalTransfer extends Transaction {
    // wykonaj operację w kwocie amount z konta from na konto to...
    // comission - prowizja
    static void execute(Account from, Account to, double amount, double comission) {
        // do przelewu trzeba doliczyć prowizję
        if (validateTransaction(from, amount + amount * comission)) {
            to.add(amount);
            from.subtract(amount * amount * comission);
            System.out.println("External transfer from " + from.printInfo() + " to " + to.printInfo() + " executed!");
        } else {
            System.out.println("Insufficient funds on account " + from.printInfo() + "!!!");
        }
    }
}
