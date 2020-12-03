public class UtilityCustomerReport {

    public static String printCustomerDaysOverdrawn(Customer customer) {
        String fullName = getFullName(customer);
        String accountDescription = "Account: IBAN: " + customer.getAccount().getIban() + ", Days Overdrawn: " + customer.getAccount().getDaysOverdrawn();
        return fullName + accountDescription;
    }

    public static String printCustomerMoney(Customer customer) {
        String fullName = getFullName(customer);
        String accountDescription = "";
        accountDescription += "Account: IBAN: " + customer.getAccount().getIban() + ", Money: " + customer.getAccount().getMoney();
        return fullName + accountDescription;
    }

    public static String printCustomerAccount(Customer customer) {
        return "Account: IBAN: " + customer.getAccount().getIban() + ", Money: "
                + customer.getAccount().getMoney() + ", Account type: " + customer.getAccount().getType();
    }

    static String getFullName(Customer customer) {
        return customer.getName() + " " + customer.getSurname() + " ";
    }
}
