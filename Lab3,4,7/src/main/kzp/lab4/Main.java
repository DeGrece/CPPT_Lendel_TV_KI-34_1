package main.kzp.lab4;

import main.kzp.lab3.Human;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setFirstName("Geogiy");
        human.setLastName("Sidorov");

        Company company1 = new Company("Apple");
        Company company2 = new Company("BMW");
        Company company3 = new Company("Pepsico");

        OfficeCenter officeCenter = new OfficeCenter();
        officeCenter.setOwner(human);

        officeCenter.createNewRoom(21000, company1);
        officeCenter.createNewRoom(28800, company3);
        officeCenter.createNewRoom(12990, company2);
        officeCenter.createNewRoom(29000, company1);
        officeCenter.createNewRoom(20100, company2);
        officeCenter.createNewRoom(20100, company2);
        officeCenter.createNewRoom(21000, company3);

        officeCenter.printAll();
        serialize(officeCenter);
        officeCenter = deserialize();
        officeCenter.printAll();
    }

    private static void serialize(OfficeCenter officeCenter){
        try(FileOutputStream fos = new FileOutputStream("objectSer.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(officeCenter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static OfficeCenter deserialize(){
        try(FileInputStream fis = new FileInputStream("objectSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (OfficeCenter)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
