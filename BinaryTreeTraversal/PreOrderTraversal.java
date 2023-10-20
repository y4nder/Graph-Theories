package BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    private Node root;
    private List<Integer> list;

    public PreOrderTraversal(Node root){
        this.root = root;
        list = new ArrayList<>();
        preOrder(this.root);
    }

    public void preOrder(Node current){
        if(current != null)
            list.add(current.getData());
        else return;
        preOrder(current.getLeft());
        preOrder(current.getRight());
    }

    public List<Integer> getPreOrdered(){
        return list;
    }

}
