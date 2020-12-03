
public class Person extends Customer{
    public Person(String name, String surname, String email, Account account) {
        super(name, surname, email, account);
    }

    public void withdraw(double sum, String currency) {
        if (getAccount().isOverdraft()) {
            getAccount().subtractMoney(currency, sum + sum * getAccount().overdraftFee());
        } else {
            getAccount().subtractMoney(currency, sum);
        }
    }

}

