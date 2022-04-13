package exercise_james.java_collection_framework.bst_postorder_delete_preorder_search;

public interface Tree<E> {
     public boolean insert(E e);
     public void postorder();
     public void inorder();
     void preorder();
     int getSize();
     boolean delete(E e);
     boolean search(E e);
}
