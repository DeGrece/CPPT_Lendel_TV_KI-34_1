package main.kzp.lab3;

public class Human {
    private String firstName, lastName;

    //Constructors
    public Human() {
        LoggerInFile.printLogToFile("Human is created.");
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        LoggerInFile.printLogToFile("Human is created.");
    }

    //Getters
    public String getFirstName() {
        LoggerInFile.printLogToFile("Get firstname: " + firstName + '.');
        return firstName;
    }

    public String getLastName() {
        LoggerInFile.printLogToFile("Get lastname: " + lastName + '.');
        return lastName;
    }

    //Setters
    public void setFirstName(String firstName) {
        LoggerInFile.printLogToFile("Set firstname: " + firstName + '.');
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LoggerInFile.printLogToFile("Set lastname: " + lastName + '.');
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        LoggerInFile.printLogToFile("Call toString from Human class.");
        return lastName + " " + firstName;
    }
}
