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
		//root=bst.delete(root, 6);
		//bst.display(root);
		
		System.out.println(bst.isNodePresent(root,7));
		
		Node parentNode=bst.getParentNode(root,16);
		if(parentNode!=null)
			System.out.println(parentNode.data);
		else
			System.out.println("Parent Node doesn't exits!!!");
		
		Node siblingNode=bst.getParentNode(root,7);
		if(siblingNode!=null)
			System.out.println(siblingNode.data);
		else
			System.out.println("Sibling Node doesn't exits!!!");
		
		

	}//end of main() method

}//end of BST class
