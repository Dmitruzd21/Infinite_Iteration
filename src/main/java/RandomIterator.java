import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

    protected int min;
    protected int max;
    protected Random random;

    public RandomIterator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandomInt() {
        random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return getRandomInt();
    }
}
