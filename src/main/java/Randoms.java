import java.util.Iterator;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(min, max);
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }
}
