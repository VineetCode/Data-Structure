package com.vineet.tree;

public class BST {

	Node root;

	public BST() {
		root = null;
	}

	public Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			if (data < root.data)
				root.left = insert(root.left, data);
			else if (data > root.data)
				root.right = insert(root.right, data);
		}
		return root;
	}//end of insert() method
	
	public Node delete(Node root, int data){
		 Node temp=null;
		 if(root==null){
			 System.out.println("Element not there in Tree!!!");
		 }else if(data<root.data){
			 root.left=delete(root.left,data);
		 }else if(data>root.data){
			 root.right=delete(root.right,data);
		 }else{
			 //Found element
			 if(root.left!=null && root.right!=null){
				 //Replace with largest in left subtree
				 
				 /*
				 temp=findPrecessor(root.left);
				 root.data=temp.data;
				 root.left=delete(root.left, root.data);*/
				 
				 Node successor=getSuccessor(root);
				 root.data=successor.data;
				 root.right=delete(root.right,successor.data);
				 return root;
			 }else{
				 //One Child
				 if(root.left==null || root.right==null){ 
				     temp=root.left==null ? root.right:root.left;
				     if(temp==null)
				    	 return null;
				     else
				    	 return root;
				 }//end of if-block
			 }//inner-else-block
		 }//outer-else-block
		return root;
	}//end of delete() method
	
	public Node getSuccessor(Node root){
		if(root==null)
		  return null;	

		Node temp=root.right;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp;
	}//end of getSuccessor() method
	
	public Node findPrecessor(Node root){
       if(root==null)
    	   return null;
       else
    	   if(root.right==null)
    		   return root;
    	   else
    		   return findPrecessor(root.right);
		
	}//end of findMax() method

	public void display(Node root) {
		System.out.println("InOrder Traversal !!!");
		inOderTraversal(root);
		System.out.println();
		//System.out.println("PostOrder Traversal !!!");
		//postOrderTraversal(root);
		System.out.println();
	//	System.out.println("PreOrder Traversal !!!");
	//	preOrderTraversal(root);
	}//end of display() method

	private void inOderTraversal(Node root) {
		if (root != null) {
			inOderTraversal(root.left);
			System.out.print(root.data + " ");
			inOderTraversal(root.right);
		}
		
	}// end of inOrderTraversal() method

	private void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data+" ");
			inOderTraversal(root.left);
			inOderTraversal(root.right);
		}
	}// end of preOrderTraversal() method

	private void postOrderTraversal(Node root) {
		if (root != null) {
			inOderTraversal(root.left);
			inOderTraversal(root.right);
			System.out.print(root.data+" ");
		}
		
	}// end of postOrderTraversal() method
	
	public boolean isNodePresent(Node root, int val){
		if(root==null)
			return false;
		boolean isPresent=false;
		
		while(root!=null){
			if(val < root.data){
				root=root.left;
			}else if(val> root.data){
				root=root.right;
			}else{
				isPresent=true;
				break;
			}
		}//end of while
		
		return isPresent;
	}//end of isNodePresent() method 
	
	public Node getParentNode(Node root,int val){
		if(root==null)
			return null;
		Node getParent=null;
		
		while(root!=null){
			if(val <root.data){
				getParent=root;
				root=root.left;
			}else if(val >root.data){
				getParent=root;
				root=root.right;
			}else{
				break;
			}
		}//end of while loop
		
		return getParent;
	}//end of getParentNode() method
	
	public Node getSiblingNode(Node root,int val){
		if(root==null || root.data==val)
			return null;
		
	    Node parentNode=null;
	    while(root!=null){
	    	if(val<root.data){
	    		parentNode=root;
	    		root=root.left;	    		
	    	}else if(val>root.data){
	    		parentNode=root;
	    		root=root.right;
	    	}else{
	    		break;
	    	}
	    }//end of while-loop;
	    if(parentNode.left!=null && val==parentNode.left.data)
	    	 return parentNode.right;
	    if(parentNode.right!=null && val==parentNode.right.data)
	    	return parentNode.left;
	    
		return null;
	}//end of getSiblingNode() method


}// end of BST class
