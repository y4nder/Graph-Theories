package BinaryTreeTraversal;

public class Test {
    public static void main(String[] args){
        int[] dataSet = {12, 32, 435, 657, 34, 768, 23};

        BinaryTree b = new BinaryTree(dataSet);
        PreOrderTraversal pre = new PreOrderTraversal(b.getRoot());
        System.out.println("PreOredered: " + pre.getPreOrdered());
        InOrderTraversal in = new InOrderTraversal(b.getRoot());
        System.out.println("InOrdered: " + in.getInOrdered());
        PostOrderTraversal post = new PostOrderTraversal(b.getRoot());
        System.out.println("PostOrdered: " + post.getPostOrdered());
    }
}
