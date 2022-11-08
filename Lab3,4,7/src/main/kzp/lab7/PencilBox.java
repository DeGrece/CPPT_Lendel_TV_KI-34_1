package main.kzp.lab7;

import main.kzp.lab7.stuff.Pen;
import main.kzp.lab7.stuff.Scissor;
import main.kzp.lab7.stuff.Stuff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class PencilBox {
    private List<Stuff> stuffList = new ArrayList<>();

    public <T extends Stuff> void putThing(T thing){
        stuffList.add(thing);
    }

    public Scissor getMinimumScissor(){
        return stuffList.stream().filter(x -> x instanceof Scissor).map(x -> (Scissor)x).min(Comparator.comparing(Scissor::getSize)).orElseThrow(NoSuchElementException::new);
    }

    public List<Scissor> getScissors(){
        return stuffList.stream().filter(x -> x instanceof Scissor).map(x -> (Scissor)x).collect(Collectors.toList());
    }

    public List<Pen> getPens(){
        return stuffList.stream().filter(x -> x instanceof Pen).map(x -> (Pen)x).collect(Collectors.toList());
    }
}
