package main.kzp.lab7;

import main.kzp.lab7.stuff.Pen;
import main.kzp.lab7.stuff.Scissor;

public class Main {
    public static void main(String[] args) {
        PencilBox pencilBox = new PencilBox();
        pencilBox.putThing(new Pen());
        pencilBox.putThing(new Pen());
        pencilBox.putThing(new Pen());
        pencilBox.putThing(new Scissor(2));
        pencilBox.putThing(new Scissor(5));

        pencilBox.getPens().forEach(Pen::doWork);
        pencilBox.getScissors().forEach(Scissor::doWork);

        System.out.println(pencilBox.getMinimumScissor().getSize());
    }
}
