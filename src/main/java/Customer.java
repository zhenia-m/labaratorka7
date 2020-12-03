public abstract class Customer {

    private String name;
    private String surname;
    private String email;
    private Account account;
    private double companyOverdraftDiscount = 1;

    public Customer(String name, String surname, String email, Account account) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.account = account;
    }

    // use only to create companies
    public Customer(String name, String email, Account account, double companyOverdraftDiscount) {
        this.name = name;
        this.email = email;
        this.account = account;
        this.companyOverdraftDiscount = companyOverdraftDiscount;
    }

    public abstract void withdraw(double sum, String currency);

    public Account getAccount() {
        return account;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String printCustomerDaysOverdrawn() {
        return UtilityCustomerReport.printCustomerDaysOverdrawn(this);
    }

    public String printCustomerMoney() {
        return UtilityCustomerReport.printCustomerMoney(this);
    }

    public String printCustomerAccount() {
        return UtilityCustomerReport.printCustomerAccount(this);
    }

    public double getCompanyOverdraftDiscount() {
        return companyOverdraftDiscount;
    }

    public void setCompanyOverdraftDiscount(double companyOverdraftDiscount) {
        this.companyOverdraftDiscount = companyOverdraftDiscount;
    }
}
