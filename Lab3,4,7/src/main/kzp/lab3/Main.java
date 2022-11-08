package main.kzp.lab3;

public class Main {
    public static void main(String[] args) {
        House house = new House();

        house.setAddress("City: Lviv, St. Stepana Bandera 12");
        house.setOwner(new Human("Yuriy", "Bobaylo"));
        house.setSquareMeters(2000.0);

        System.out.println(house.toString());
    }
}
