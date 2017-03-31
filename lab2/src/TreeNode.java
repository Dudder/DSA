/**
 * Created by Dudder on 2017.03.27..
 */
public class TreeNode<E> implements ITreeNode<E>{

    private E data;
    private TreeNode<E> parent;
    private TreeNode<E>[] children;

    public TreeNode(E data , TreeNode<E> parent) {
        this.parent = parent;
        children = new TreeNode[0];
        this.data = data;
        if (!this.isRoot()) {
            parent.addChild(this);
        }
    }
    public E getData(){
        return data;
    }
    public void setData(E data){
        this.data = data;
    }
    public boolean isInternal(){
        return (children.length>0);
    }
    public boolean isExternal() {
        return (children.length == 0);
    }
    public TreeNode<E> getParent(){
        return parent;
    }
    public TreeNode<E>[] getChildren() {
        return children;
    }
    public boolean isRoot() {
        return(parent == null);
    }
    private void addChild(TreeNode<E> child){
        TreeNode<E>[] newArray =  new TreeNode[children.length+1];
        for (int i = 0; i <children.length ; i++) {
            newArray[i] = children[i];
        }
        newArray[children.length] = child;
        children = newArray;
    }
}
