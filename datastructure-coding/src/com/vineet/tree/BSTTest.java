package com.vineet.tree;

     	
public class BSTTest {
	static Node root=null;
	public static void main(String[] args) {
		BST bst=new BST();
		root=bst.insert(root,10);
		root=bst.insert(root, 6);
		root=bst.insert(root,16);
		root=bst.insert(root,4);
		root=bst.insert(root, 9);
		root=bst.insert(root,13);
		root=bst.insert(root,7);
		
		System.out.println("Root Node ::"+root.data);
		
		bst.display(root);
		
		//root=bst.delete(root,4);
		
		//bst.display(root);
		
		root=bst.delete(root, 6);
		
	   
		bst.display(root);
		

	}//end of main() method

}//end of BST class
