public class Account {

    private Money money = new Money();
    private String iban;
    private boolean premium;
    private int daysOverdrawn;

    public Account(int daysOverdrawn, boolean premium) {
        super();
        this.daysOverdrawn = daysOverdrawn;
        this.premium = premium;
    }

    public double bankcharge() {
        double result = 4.5;

        result += overdraftCharge();

        return result;
    }

    private double overdraftCharge() {
        if (isPremium()) {
            double result = 10;
            if (getDaysOverdrawn() > 7)
                result += (getDaysOverdrawn() - 7) * 1.0;
            return result;
        } else
            return getDaysOverdrawn() * 1.75;
    }

    public double overdraftFee() {
        if (isPremium()) {
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
                + money.getMoney() + ", Account type: " + getAccountTypeString();
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

    public boolean isPremium() { return premium; }

    public String getAccountTypeString() { return isPremium() ? "premium" : "normal"; }

    public String getCurrency() {
        return money.getCurrency();
    }

    public void setCurrency(String currency) {
        money.setCurrency(currency);
    }

    public void subtractMoney(String currency, double sum){
        money.subtractMony(currency, sum);}
}
