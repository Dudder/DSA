/**
 * Created by Dudder on 2017.03.27..
 */
public class Test {
    public static void main(String[] args) {

        TreeNode root = new TreeNode("A", null);
        TreeNode B = new TreeNode("B", root);
        TreeNode C = new TreeNode("C", root);
        TreeNode D = new TreeNode("D", root);
        TreeNode E = new TreeNode("E", root);
        TreeNode F = new TreeNode("F", root);
        TreeNode G = new TreeNode("G", root);

        TreeNode H = new TreeNode("H", B);
        TreeNode I = new TreeNode("I", B);
        TreeNode J = new TreeNode("J", B);

        TreeNode K = new TreeNode("K", E);
        TreeNode L = new TreeNode("L", E);

        TreeNode M = new TreeNode("M", G);

        TreeNode N = new TreeNode("N", H);
        TreeNode O = new TreeNode("O", H);

        TreeNode P = new TreeNode("P", K);

        TreeNode Q = new TreeNode("Q", L);

        //TESTCASES
        //printPreOrder(root);
        //printPostOrder(root);

        //ConvertTo2 binary = new ConvertTo2(root);
        //printInOrder(binary.getRoot()); //LOL give me root@kali

        //ConvertFrom2 arbitrary = new ConvertFrom2(binary.getRoot());
        //printPreOrder(arbitrary.getRoot());

        //ConvertToText text = new ConvertToText(binary.getRoot());
        //System.out.println(text.getText());
    }

    public static void printPreOrder(TreeNode root) {
        System.out.println(root.getData());
        for (TreeNode node : root.getChildren()) {
            printPreOrder(node);
        }
    }

    public static void printPostOrder(TreeNode root) {
        for (TreeNode node : root.getChildren()) {
            printPostOrder(node);
        }
        System.out.println(root.getData());
    }

    public static void printInOrder(BinaryTreeNode root) {
        System.out.println(root.getData());
        if (root.leftChild() != null) {
            printInOrder(root.leftChild());
        }
        if (root.rightChild() != null) {
            printInOrder(root.rightChild());
        }
    }
}
