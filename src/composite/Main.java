package composite;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         *              10
         *             / | \
         *            /  |  \
         *           /   |   \
         *          /    |    \
         *         /     |     \
         *        /      |      \
         *       /       |       \
         *     15        4        13
         *    / | \     / \
         *   9  12 13  11  9
         *      
         */
        IComponent lc1 = new Leaf(9);
        IComponent lc2 = new Leaf(12);
        IComponent lc3 = new Leaf(13);

        List<IComponent> lChildren = Arrays.asList(new IComponent[] { lc1, lc2, lc3 });
        IComponent l = new NonLeaf(lChildren, 15);

        IComponent mc1 = new Leaf(11);
        IComponent mc2 = new Leaf(9);

        List<IComponent> mChildren = Arrays.asList(new IComponent[] { mc1, mc2 });
        IComponent m = new NonLeaf(mChildren, 4);

        IComponent r = new Leaf(13);

        List<IComponent> rootChildren = Arrays.asList(new IComponent[] { l, m, r });
        IComponent root = new NonLeaf(rootChildren, 10);

        System.out.println(root.sum());
    }
}
