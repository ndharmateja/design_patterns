package composite;

public abstract class IComponent {
    private int value;

    protected IComponent(int value) {
        this.value = value;
    }

    public abstract int sum();

    public int getValue() {
        return this.value;
    }
}