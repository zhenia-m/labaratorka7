public class CustomerFactory {
    public static Customer createCompany(String name, String email, Account account, double companyOverdraftDiscount) {
        return new Company(name, email, account, companyOverdraftDiscount);
    }

    public static Customer createPerson(String name, String surname, String email,  Account account) {
        return new Person(name, surname, email, account);
    }

}
