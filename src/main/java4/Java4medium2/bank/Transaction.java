package Java4medium2.bank;

abstract class Transaction {
    // uniemożliwiamy stworzenie przelewu
    Transaction() {
    }

    // sprawdzamy czy na koncie from jest odpowiednia ilość pieniędzy
    protected static boolean validateTransaction(Account from, double amount) {
        return from.getAmount() >= amount;
    }
}
