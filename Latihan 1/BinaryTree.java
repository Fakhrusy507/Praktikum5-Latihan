
public class BinaryTree {
    public Node root;

    public void NewNode(int data){
        root = NewNode(root, new Node(data));
    }

    private Node NewNode(Node root, Node newData) {
        if ( root == null){
            root = newData;
            return root;
        }
        if (newData.data < root.data){
            root.left = NewNode(root.left, newData);
        }
        else{
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void Inorder(Node node){
        if(node != null){
            System.out.printf(node.data + " ");
            Inorder(node.left);
            Inorder(node.right);
        }
    }

    public void Preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            Preorder(node.left);
            Preorder(node.right);
        }
    }

    public void Postorder(Node node) {
        if (node != null) {
            Postorder(node.left);
            Postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
