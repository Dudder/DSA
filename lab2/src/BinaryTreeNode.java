/**
 * Created by Dudder on 2017.03.27..
 */
public class BinaryTreeNode<E> implements IBinaryTreeNode<E>{

    private E data;
    private BinaryTreeNode parent;
    private  BinaryTreeNode sibling;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(E data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
    public E getData(){
        return data;
    }
    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public void setParent(BinaryTreeNode parent){
        this.parent = parent;
    }

    public void setSibling(BinaryTreeNode sibling) {
        this.sibling = sibling;
    }

    public void setData(E data){
        this.data = data;
    }
    public BinaryTreeNode leftChild() {
        return leftChild;
    }
    public BinaryTreeNode rightChild() {
        return rightChild;
    }

    public BinaryTreeNode getParent() {
        return parent;
    }

    public BinaryTreeNode getSibling() {
        return sibling;
    }
}
