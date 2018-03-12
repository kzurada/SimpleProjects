package bank.simple;


import bank.simple.bank.Bank;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank", 10, 0.02, 0.05);
        Client janKowalski = new Client("Jan Kowalski", 35, "Katowice");
        Client adamNowak = new Client("Adam Nowak", 31, "Chorzów");

        bank.addNewClient(janKowalski, 2000.0, 100.0);
        bank.addNewClient(adamNowak, 1500.0, 200.0);

        bank.executeInternalTransfer(janKowalski.getSavingAccount(), janKowalski.getCheckingAccount(), 150.0);
        bank.executeExternalTransfer(janKowalski.getCheckingAccount(), adamNowak.getSavingAccount(), 200.0);
        bank.executeInternalTransfer(janKowalski.getSavingAccount(), janKowalski.getCheckingAccount(), 2000.0);

        bank.computeInterests();
    }
}
