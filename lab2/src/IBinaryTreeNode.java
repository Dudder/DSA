public interface IBinaryTreeNode<E>{

    E getData();
    void setData(E e);
    BinaryTreeNode<E> rightChild();
    BinaryTreeNode<E> leftChild();
}
