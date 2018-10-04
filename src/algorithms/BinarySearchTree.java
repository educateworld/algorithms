package algorithms;

// Java program to demonstrate insert operation in binary search tree 
class BinarySearchTree { 
	class Node{
		int key;
		Node left,right;
		Node(int key)
		{
			this.key = key;
			left = right = null;
		}
	}
	
	Node root;
	 BinarySearchTree() {
		 root = null;
	}
	
	Node insert(int key) {
		root = insertRec(root,key);
		return root;
	}
	
	 Node insertRec(Node root, int key) {
		 if(root == null)
			 root = new Node(key);
		 if(key<root.key)
			 root.left = insertRec(root.left, key);
		 else if(key>root.key)
			 root.right = insertRec(root.right, key);
		return root;
	}

	void inorder() {
		inorderRec(root);
	}

 void inorderRec(Node root) {
		if(root!=null) {
		inorderRec(root.left);
		System.out.println(root.key);
		inorderRec(root.right);}
	}
 
 void search(int key)
 {
	System.out.println( search(root,key).key);
 }
  Node search(Node root, int key) {
		if(root == null || root.key == key)
			return root;
		if(key <root.key)
			return search(root.left,key);
			
		
		return search(root.right,key);
	}
  void deleteKey(int key) 
  { 
      root = deleteRec(root, key); 
  } 

  /* A recursive function to insert a new key in BST */
  Node deleteRec(Node root, int key) 
  { 
      /* Base Case: If the tree is empty */
      if (root == null)  return root; 

      /* Otherwise, recur down the tree */
      if (key < root.key) 
          root.left = deleteRec(root.left, key); 
      else if (key > root.key) 
          root.right = deleteRec(root.right, key); 

      // if key is same as root's key, then This is the node 
      // to be deleted 
      else
      { 
          // node with only one child or no child 
          if (root.left == null) 
              return root.right; 
          else if (root.right == null) 
              return root.left; 

          // node with two children: Get the inorder successor (smallest 
          // in the right subtree) 
          root.key = minValue(root.right); 

          // Delete the inorder successor 
          root.right = deleteRec(root.right, root.key); 
      } 

      return root; 
  } 

  int minValue(Node root) 
  { 
      int minv = root.key; 
      while (root.left != null) 
      { 
          minv = root.left.key; 
          root = root.left; 
      } 
      return minv; 
  } 
public static void main(String[] args) {
	   BinarySearchTree bst = new BinarySearchTree();
	   bst.insert(20);
	   bst.insert(50);
	   bst.insert(30);
	   bst.insert(60);
	   bst.insert(90);
	   
	   bst.inorder();
	   
	   bst.search(50);
	   bst.deleteKey(20);
	
}

}
