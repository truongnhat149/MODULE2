package Exercise.java_collection_framework.tree_node_ionrder;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("geogre");
        tree.insert("michal");
        tree.insert("tom");
        tree.insert("adam");
        tree.insert("jone");
        tree.insert("Peter");

        System.out.println("Inorder (sorted) : ");
        tree.inorder();
        System.out.println(" the number of nodes " + tree.getSize());
    }
}
