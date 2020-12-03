public class Company extends Customer{

    public Company(String name, String email, Account account, double companyOverdraftDiscount) {
        super(name, email, account, companyOverdraftDiscount);
    }

    public void withdraw(double sum, String currency) {
        if (!getAccount().getCurrency().equals(currency)) {
            throw new RuntimeException("Can't extract withdraw " + currency);
        }

        int Divider = 1;
        if (getAccount().getType().isPremium()) {
            Divider = 2;
        }

        if (getAccount().isOverdraft()) {
            getAccount().subtractMoney(currency, sum + sum * getAccount().overdraftFee() * getCompanyOverdraftDiscount() / Divider);
        } else {
            getAccount().subtractMoney(currency, sum);
        }
    }
}

