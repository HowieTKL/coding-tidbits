package org.howietkl.challenges;

public class TreeHeight {
    static class Node {
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        /*          x
         *         / \
         *        x   x
         *       / \
         *      x   x
         *       \
         *        x
         */

        Node root = new Node();
        root.left = new Node();
        root.right = new Node();
        root.left.left = new Node();
        root.left.right = new Node();
        root.left.left.right = new Node();

        Node root1 = new Node();

        System.out.println(height1(root));
        System.out.println(height1(root1));
    }

    static int height1(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + Math.max(height1(n.left), height1(n.right));
        }
    }

}
