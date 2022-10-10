package composite;

import java.util.List;

public class NonLeaf extends IComponent {

    private List<IComponent> children;

    public NonLeaf(List<IComponent> children, int value) {
        super(value);
        this.children = children;
    }

    @Override
    public int sum() {
        int total = this.getValue();
        for (IComponent child : this.children) {
            total += child.sum();
        }
        return total;
    }
}
