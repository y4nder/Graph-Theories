package BinaryTreeTraversal;

public class BinaryTree {
    private Node root;

    public BinaryTree(int[] dataSet){
        this.root = new Node(dataSet[0]);
        setTree(dataSet, 1, this.root);
    }

    public void setTree(int[] dataSet, int index, Node current){
        if(index >= dataSet.length) return;

        if(dataSet[index] < current.getData()){
            if(current.getLeft() == null){
                current.setLeft(new Node(dataSet[index]));
                setTree(dataSet, index+1, root);
            }
            else{
                setTree(dataSet, index, current.getLeft());
            }
        }
        else{
            if(current.getRight() == null){
                current.setRight(new Node(dataSet[index]));
                setTree(dataSet, index+1, root);
            }
            else{
                setTree(dataSet, index, current.getRight());
            }
        }

    }

    public Node getRoot(){
        return this.root;
    }
}
