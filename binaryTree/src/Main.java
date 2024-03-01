public class Main {
    public static void main(String[] args) {
        /* Binary Search Tree = A tree data structure, where each node is greater than it's left child,
        *                       but less than it's right.
        *
        *                       benefit: easy to locate a node when they are in this order
        *
        *                       time complexity: best case O(log n)
        *                                        worst case O(n)
        *
        *                       space complexity: O(n)
        */
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display();
        System.out.println();
        System.out.println(tree.search(0));
        System.out.println(tree.search(1));
        System.out.println(tree.search(9));
        System.out.println(tree.search(10));

        System.out.println();
        tree.remove(10);
        tree.remove(5);

        System.out.println();
        tree.display();

    }
}