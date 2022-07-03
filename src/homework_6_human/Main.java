package homework_6_human;

import homework_6_animal.Farrot;
import homework_6_car.Car;
import homework_6_car.Truck;

public class Main {
    public static void main(String[] args) {
        /**
         * 6.1 и 6.2 Тесты
         */
        Client client1 = new Client("Bob", "Dow", "ChackA");
        Client client2 = new Client("Marsy", "Dow", "UkaUka");
        BankEmployee employee1 = new BankEmployee("Gibby", "Gross", "WWP");
        BankEmployee employee2 = new BankEmployee("Fargo", "Moss", "WWP");
        Human human1 = new Client("Odd", "Code", "OMG");
        Human human2 = new BankEmployee("Barny", "Stinson", "FFP");

        client1.printInfo();
        client2.setBankName("ChackA");
        client2.printInfo();

        client1.setName("Lenny");
        client1.setSurname("Lebedev");
        client1.printInfo();

        employee1.setBankName("Jiga");
        employee1.printInfo();

        human1.printInfo();
        human2.setSurname("Bowl");
        human2.printInfo();
        employee2.getBankName();
        employee2.printInfo();
        /**
         * 6.3 Тест
         */
        Car hundai = new Truck(2560,"Pathfinder", 'b', 120.3f,6,3500.5f);
        Truck uaz = new Truck(2500,"2301", 'r',90f,4,6000f);
        Truck zil = new Truck(3000,"1206",'w',70f,8,9000f);

        hundai.outPut();
        uaz.outPut();
        zil.outPut();
        uaz.newWheels();
        zil.newWheels();
        uaz.outPut();
        zil.outPut();
        /**
         * 6.4, 6.5 Тест
         */
        Farrot tesla = new Farrot();
        Farrot pinky = new Farrot();

        tesla.setParameters();
        pinky.setParameters();
        tesla.printInfo();
        pinky.printInfo();
    }
}