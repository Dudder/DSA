/**
 * Created by Dudder on 2017.03.28..
 */
public class ConvertFrom2 {

    private TreeNode root;

    public ConvertFrom2(BinaryTreeNode biroot){
        root = new TreeNode(biroot.getData(),null);
        assign(biroot,root);
    }
    public static void assign(BinaryTreeNode biroot,TreeNode root) {

        if (biroot.leftChild() != null) {
            TreeNode left = new TreeNode<>(biroot.leftChild().getData(),root);
            assign(biroot.leftChild(),left);
        }
        if (biroot.rightChild() != null) {
            TreeNode right = new TreeNode<>(biroot.rightChild().getData(),root.getParent());
            assign(biroot.rightChild(),right);
        }
    }
    public TreeNode getRoot(){
        return root;
    }
}
