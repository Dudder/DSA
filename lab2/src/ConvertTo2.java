/**
 * Created by Dudder on 2017.03.28..
 */
public class ConvertTo2 {

    private BinaryTreeNode biroot;

    public ConvertTo2(TreeNode root){
        biroot = new BinaryTreeNode(root.getData());
        assign(biroot,root);
    }
    public static void assign(BinaryTreeNode biroot,TreeNode root) {

        if (root.getChildren().length > 0) {
            BinaryTreeNode left = new BinaryTreeNode(root.getChildren()[0].getData());
            biroot.setLeftChild(left);
            left.setParent(biroot);
            assign(left,root.getChildren()[0]);
        }
        if (        !root.isRoot() &&
                root.getParent().getChildren().length > 1 &&
                root != root.getParent().getChildren()[root.getParent().getChildren().length-1]) {
            BinaryTreeNode right = new BinaryTreeNode(getNextSibling(root).getData());
            biroot.setRightChild(right);
            right.setSibling(biroot);
            right.setParent(biroot.getParent());
            assign(right,getNextSibling(root));
        }
    }

    private static TreeNode getNextSibling(TreeNode node){
        for (int i = 0; i <node.getParent().getChildren().length ; i++) {
            if(node.getData().equals(node.getParent().getChildren()[i].getData()) &&
                    (i+1)<node.getParent().getChildren().length){
                return node.getParent().getChildren()[i+1];
            }
        }
        return null;
    }
    public BinaryTreeNode getRoot(){
        return biroot;
    }
}