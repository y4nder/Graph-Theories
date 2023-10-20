package BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    private Node root;
    private List<Integer> list = new ArrayList<>();

    public InOrderTraversal(Node root){
        this.root = root;
        inOrder(this.root);
    }

    public void inOrder(Node currentNode){
        if(currentNode == null){
            return;
        }
        inOrder(currentNode.getLeft());
        list.add(currentNode.getData());
        inOrder(currentNode.getRight());
    }

    public List<Integer> getInOrdered(){
        return list;
    }
}
