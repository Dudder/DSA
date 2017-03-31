
public interface ITreeNode<E> {

    E getData();
    void setData(E e);
    boolean isRoot();
    boolean isInternal();
    boolean isExternal();
    ITreeNode<E> getParent();
    ITreeNode<E>[] getChildren();
}
