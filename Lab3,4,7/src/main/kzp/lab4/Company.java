package main.kzp.lab4;

import java.io.Serializable;

public class Company implements Serializable {
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company: " + name + '\n';
    }
}
