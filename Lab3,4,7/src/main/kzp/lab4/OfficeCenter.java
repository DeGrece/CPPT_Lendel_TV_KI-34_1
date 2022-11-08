package main.kzp.lab4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OfficeCenter extends House implements Externalizable {
    private List<OfficeRoom> officeRooms = new ArrayList<>();

    public void createNewRoom(double pricePerMonth, Company companyRenter){
        officeRooms.add(new OfficeRoom(pricePerMonth, companyRenter));
    }

    public void printAll(){
        System.out.println("#".repeat(30));
        printOfficeCenterData();
        printAllOfficeRooms();
        System.out.println("#".repeat(30));
    }

    public void printOfficeCenterData(){
        System.out.println(super.toString());
    }

    public void printAllOfficeRooms(){
        for(int i = 0; i < officeRooms.size(); ++i)
            System.out.println(String.format("Room #%d\n%s\n", i+1, officeRooms.get(i)));
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);
        out.writeObject(officeRooms);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in);
        officeRooms = (List<OfficeRoom>)in.readObject();
    }

    private class OfficeRoom implements Serializable {
        private double pricePerMonth;
        private Company companyRenter;

        public OfficeRoom() {
        }

        public OfficeRoom(double pricePerMonth) {
            this.pricePerMonth = pricePerMonth;
        }

        public OfficeRoom(double pricePerMonth, Company companyRenter) {
            this.pricePerMonth = pricePerMonth;
            this.companyRenter = companyRenter;
        }

        public double getPricePerMonth() {
            return pricePerMonth;
        }

        public Company getCompanyRenter() {
            return companyRenter;
        }

        public void setPricePerMonth(double pricePerMonth) {
            this.pricePerMonth = pricePerMonth;
        }

        public void setCompanyRenter(Company companyRenter) {
            this.companyRenter = companyRenter;
        }

        @Override
        public String toString() {
            return companyRenter.toString() + "Price per month: " + pricePerMonth;
        }
    }
}
