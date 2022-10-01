//Binary Tree in Java
public class BinaryTree {
    

    public static void main(String[] args) throws Exception {
        
        //Create root node President
       Node President =  new Node("President");
       //Create node Manager 
       Node Manager = new Node("Manager");
       //Create node Marketing
       Node Marketing =  new Node("Marketing");
       //Create node Deputy Marketing
       Node DeputyManager =  new Node("Deputy Manager");
       //Create Business Analyst Manager
       Node BusinessAnalystManager = new Node("Business Analyst Manager");
       //Create Sub. Marketing
       Node SubMarketing =  new Node("Sub. Marketing");
       //Create node Marketing Research
       Node MarketingResearch =  new Node("Marketing Reasearch");

         // Set left and right child of root node President
         President.left = Manager;
         President.right = Marketing;
 
         // Set left and right child of node B
         Manager.left = DeputyManager;
         Manager.right = BusinessAnalystManager;
 
         // Set left and right child of node C
         Marketing.left = SubMarketing;
         Marketing.right = MarketingResearch;

         System.out.print("\nIn order Traversal: ");
         traverseInOrder(President);
         System.out.print("\nPre order Traversal: ");
         traversePreOrder(President);
 
         System.out.print("\nPost order Traversal: ");
         traversePostOrder(President);
     }
 
     // Traverse Inorder Method
     static void traverseInOrder(Node node) {
         if (node != null) {
             traverseInOrder(node.left);
             System.out.print(" " + node.data);
             traverseInOrder(node.right);
         }
        }
         // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
