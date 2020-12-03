public class UtilityCustomerReport {

    public static String printCustomerDaysOverdrawn(Customer customer) {
        String fullName = getFullName(customer);
        String accountDescription = customer.getAccount().getDaysOverdrawnAccountDescription();
        return fullName + accountDescription;
    }

    public static String printCustomerMoney(Customer customer) {
        String fullName = getFullName(customer);
        String accountDescription = "";
        accountDescription += customer.getAccount().getMoneyAccountDescription();
        return fullName + accountDescription;
    }


    public static String printCustomerAccount(Customer customer) {
        return customer.getAccount().getAccountDescription();
    }

    static String getFullName(Customer customer) {
        return customer.getName() + " " + customer.getSurname() + " ";
    }

    public static String printCustomer(Customer customer) {
        return customer.getName() + " " + customer.getEmail();
    }
}
