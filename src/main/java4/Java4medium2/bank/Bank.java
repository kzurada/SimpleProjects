package Java4medium2.bank;


import Java4medium2.Client;

/*
 * Tylko klasa Bank powinna mieć metody publiczne - we wszystkich innych klasach z tego pakietu staramy się
 * ukryć co się da przed światem. Dostęp do tworzenia kont, przelewów, itp. powinien mieć tylko Bank.
 * Dlatego zwróć uwagę na modyfikatory dostępu we wszystkich klasach i metodach w tym pakiecie!
 */
public class Bank {
    private final String name;
    // maksymalna ilość klientów w banku
    private final int maxClients;
    // klienci banku
    private final Client[] clients;
    private int clientsAmount = 0;
    // aktualna wartość procentów odsetek na koncie oszczędnościowym
    private double currentInterestPercent;
    // aktualna wartość prowizji za przelew zewnętrzny
    private double currentExternalTransferComission;

    public Bank(String name, int maxClients, double currentInterestPercent, double currentExternalTransferComission) {
        this.name = name;
        this.maxClients = maxClients;
        this.currentInterestPercent = currentInterestPercent;
        this.currentExternalTransferComission = currentExternalTransferComission;
        this.clients = new Client[this.maxClients];
    }

    // dodajemy nowego klienta, któremu zakładamy rachunek oszczędnościowy i bieżący
    // savingAccountAmount - początkowa kwota na konto oszczędnościowe
    // checkingAccountAmount - początkowa kwota na konto bieżące
    public void addNewClient(Client client, double savingAccountAmount, double checkingAccountAmount) {
//        client.setCheckingAccount(new CheckingAccount(client, checkingAccountAmount));
//        client.setSavingAccount(new SavingAccount(client, savingAccountAmount));
        this.clients[this.clientsAmount] = client;
        clientsAmount++;
        System.out.println("New client " + client.printInfo() + " added!");
    }

    public void setCurrentInterestPercent(double currentInterestPercent) {
        this.currentInterestPercent = currentInterestPercent;
    }

    public void setCurrentExternalTransferComission(double currentExternalTransferComission) {
        this.currentExternalTransferComission = currentExternalTransferComission;
    }

    public void executeInternalTransfer(Account from, Account to, double amount) {
        InternalTransfer.execute(from, to, amount);
    }

    public void executeExternalTransfer(Account from, Account to, double amount) {
        ExternalTransfer.execute(from, to, amount, this.currentExternalTransferComission);
    }

    // przeliczenie odsetek na kontach osczędnościowych klientów
    public void computeInterests() {
        System.out.println("Computing interests!");
        for (int i = 0; i < this.clientsAmount; i++) {
            System.out.println("Before interests computing: " + this.clients[i].getSavingAccount().printInfo());
            this.clients[i].getSavingAccount().computeIntereset(this.currentInterestPercent);
            System.out.println("After interests computing: " + this.clients[i].getSavingAccount().printInfo());
        }
        System.out.println("Interests computed!");
    }
}
