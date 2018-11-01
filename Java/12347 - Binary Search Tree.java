import java.util.Scanner;

public class Main {
		
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			Main tree = new Main();
			
			while (in.hasNextInt()) {
				tree.insert(in.nextInt());
			}
			
			tree.preOrder();

		}
		
		
		public class Node {
			 
			  public int value;
			 
			  public Node left;
			  public Node right;
			 
			  public Node(int value) {
			    this.value = value;
			   
			    this.left = null;
			    this.right = null;
			  }
			 
			}
	 
	  public Node root;
	 
	  public Main() {
	    this.root = null;
	  }
	 
	  public void insert(int value) {
	    root = insert(root, value);
	  }
	 
	  public Node insert(Node root, int value) {
	    if(root == null) {
	      root = new Node(value);
	    } else if(value < root.value) {
	      root.left = insert(root.left, value);
	    } else if(value > root.value) {
	      root.right = insert(root.right, value);
	    }
	    return root;
	  }
	 
	  public void preOrder() {
	    preOrder(root);
	  }
	 
	  public void preOrder(Node root) {
	    if(root == null) {
	      return;
	    }
	    preOrder(root.left);             // E
	    preOrder(root.right);            // D
	    System.out.println(root.value);  // R
	  }
	 
	}
