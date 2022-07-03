package homework_6_human;
/**
 * 6.1 реализация
 */
public abstract class Human implements GetInformation {
    protected String name;
    protected String surname;

    protected Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    protected String getName() {
        name = "John";
        return name;
    }

    protected String getSurname() {
        surname = "Dow";
        return surname;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }
}
