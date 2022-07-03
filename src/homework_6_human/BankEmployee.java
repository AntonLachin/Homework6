package homework_6_human;
/**
 * 6.1 реализация
 */
public class BankEmployee extends Human {
    private String bankName;

    protected BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    public String toString() {
        return super.toString() + ", bankName = '"+ bankName+'\'';
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    public String getBankName() {
        bankName = "sberbank";
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }
}
