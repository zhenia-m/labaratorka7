public class Account {

    private final Money money = new Money();
    private String iban;

    private AccountType type;

    private int daysOverdrawn;

    public Account(AccountType type, int daysOverdrawn) {
        super();
        this.type = type;
        this.daysOverdrawn = daysOverdrawn;
    }

    public double bankcharge() {
        double result = 4.5;

        result += overdraftCharge();

        return result;
    }

    private double overdraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (getDaysOverdrawn() > 7)
                result += (getDaysOverdrawn() - 7) * 1.0;
            return result;
        } else
            return getDaysOverdrawn() * 1.75;
    }

    public double overdraftFee() {
        if (type.isPremium()) {
            return 0.10;
        } else {
            return 0.20;
        }
    }

    String getDaysOverdrawnAccountDescription(){
        return "Account: IBAN: " + getIban() + ", Days Overdrawn: " + getDaysOverdrawn();
    }

    String getMoneyAccountDescription(){
        return "Account: IBAN: " + getIban() + ", Money: " + money.getMoney();
    }

    String getAccountDescription(){
        return "Account: IBAN: " + getIban() + ", Money: "
                + money.getMoney() + ", Account type: " + getType();
    }

    public boolean isOverdraft() {
        return money.getMoney() < 0;
    }

    public int getDaysOverdrawn() {
        return daysOverdrawn;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setMoney(double money) {
        this.money.setMoney(money);
    }

    public double getMoney() {
        return money.getMoney();
    }

    public AccountType getType() {
        return type;
    }

    public String getCurrency() {
        return money.getCurrency();
    }

    public void setCurrency(String currency) {
        money.setCurrency(currency);
    }

    public void subtractMoney(String currency, double sum){
        money.subtractMony(currency, sum);}
}
