package Java15.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(20);
        bt.add(38);
        bt.add(7);

        bt.traversePreOrder(bt.root);
    }
}
