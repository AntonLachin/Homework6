package homework_6_human;
/**
 * 6.1 реализация
 */
public class Client extends Human {
    private String bankName;

    protected Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return super.toString() + ", bankName = '" + bankName + '\'';
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    public String getBankName() {
        bankName = "tin'koff";
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
