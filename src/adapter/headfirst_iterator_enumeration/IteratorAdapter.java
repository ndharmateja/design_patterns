package adapter.headfirst_iterator_enumeration;

import java.util.Iterator;

public class IteratorAdapter<T> implements Enumeration<T> {

    private Iterator<T> iterator;

    public IteratorAdapter(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return this.iterator.next();
    }

}
