package bank.simple.bank;

// przelew własny
class InternalTransfer extends Transaction {
    // wykonaj operację w kwocie amount z konta from na konto to...
    static void execute(Account from, Account to, double amount) {
        if (validateTransaction(from, amount)) {
            to.add(amount);
            from.subtract(amount);
            System.out.println("Internal transfer from " + from.printInfo() + " to " + to.printInfo() + " executed!");
        } else {
            System.out.println("Insufficient funds on account " + from.printInfo() + "!!!");
        }
    }
}
