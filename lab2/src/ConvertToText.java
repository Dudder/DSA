import java.util.ArrayList;

/**
 * Created by Dudder on 2017.03.28..
 */
public class ConvertToText {

    private BinaryTreeNode root;
    private String text;

    public ConvertToText(BinaryTreeNode root){
        this.root = root;
        text = new String();
        ArrayList<BinaryTreeNode> set = new ArrayList<>();
        convert(root,set);
    }
    public void convert(BinaryTreeNode root, ArrayList set){
        text+= root.getData();
        set.add(root);
        if(     root.leftChild() != null ||
                root.rightChild() != null ||
                (set.contains(root.leftChild()) && set.contains(root.rightChild()))) {
                    text+= "(";

                    if (!set.contains(root.leftChild()) && root.leftChild() != null) {
                        convert(root.leftChild(), set);
                    }
                    if (!set.contains(root.rightChild()) && root.rightChild() != null) {
                        convert(root.rightChild(), set);
                    }

        }else{
            backtrack(root,set);
        }
    }
    public void backtrack(BinaryTreeNode root,ArrayList set){
        if (    root.leftChild() == null && root.rightChild() == null && root.getParent()!= null    ||
                set.contains(root.leftChild()) && root.rightChild() == null && root.getParent() !=null ||
                set.contains(root.rightChild()) && root.leftChild() == null && root.getParent() != null ||
                set.contains(root.leftChild()) && set.contains(root.rightChild()) && root.getParent() !=null){
            text+= ")";
            if(root.getSibling()!=null){
                backtrack(root.getSibling(),set);
            }else{
                backtrack(root.getParent(),set);
            }
        }
    }
    public String getText(){
        return text;
    }
}
