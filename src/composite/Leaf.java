package composite;

public class Leaf extends IComponent {

    public Leaf(int value) {
        super(value);
    }

    @Override
    public int sum() {
        return this.getValue();
    }

}
