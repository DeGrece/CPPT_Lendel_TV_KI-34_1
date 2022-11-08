package main.kzp.lab7.stuff;

public class Scissor implements Stuff{

    private int size;

    public Scissor(int size) {
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("The scissor cut off smth.");
    }

    public int getSize() {
        return size;
    }
}
