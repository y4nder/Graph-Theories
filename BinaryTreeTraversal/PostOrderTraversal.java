package BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    private Node root;
    private List<Integer> list;

    public PostOrderTraversal(Node root){
        this.root = root;
        list = new ArrayList<>();
        postOrder(this.root);
    }

    private void postOrder(Node currentNode){
        if(currentNode == null){
            return;
        }

        postOrder(currentNode.getLeft());
        postOrder(currentNode.getRight());
        list.add(currentNode.getData());
    }

    public List<Integer> getPostOrdered(){
        return list;
    }
}
