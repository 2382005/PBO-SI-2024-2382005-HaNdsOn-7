package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount RachelRatnaSari = new BankAccount(100);
        RachelRatnaSari.withdraw(10);
        RachelRatnaSari.deposit(30);
        System.out.println(RachelRatnaSari.getSaldo());
    }
}