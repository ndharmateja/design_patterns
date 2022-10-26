package adapter.headfirst_iterator_enumeration;

public interface Enumeration<T> {
    public boolean hasMoreElements();

    public T nextElement();
}
