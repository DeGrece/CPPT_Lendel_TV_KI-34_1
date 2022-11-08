package main.kzp.lab4;

import main.kzp.lab3.Human;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public abstract class House implements Externalizable {
    private String address;
    private Human owner;
    private double squareMeters;

    public String getAddress() {
        return address;
    }

    public Human getOwner() {
        return owner;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(address);
        out.writeDouble(squareMeters);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        address = (String)in.readObject();
        squareMeters = in.readDouble();
    }

    @Override
    public String toString() {
        return "\nHouse:\n" +
                "\taddress: " + address + '\n' +
                "\towner: " + owner + '\n' +
                "\tsquareMeters: " + squareMeters + "\n";
    }
}
