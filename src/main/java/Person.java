
public class Person extends Customer{
    public Person(String name, String surname, String email, Account account) {
        super(name, surname, email, account);
    }

    public void withdraw(double sum, String currency) {
        if (!getAccount().getCurrency().equals(currency)) {
            throw new RuntimeException("Can't extract withdraw " + currency);
        }
        if (getAccount().getMoney() < 0) {
            getAccount().setMoney((getAccount().getMoney() - sum) - sum * getAccount().overdraftFee());
        } else {
            getAccount().setMoney(getAccount().getMoney() - sum);
        }
    }
}

