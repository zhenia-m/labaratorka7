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
        // we are in overdraft
        if (getAccount().getMoney() < 0) {
            // 50 percent discount for overdraft for premium account
            getAccount().setMoney((getAccount().getMoney() - sum) - sum * getAccount().overdraftFee() * getCompanyOverdraftDiscount() / Divider);
        } else {
            getAccount().setMoney(getAccount().getMoney() - sum);
        }

    }
}

