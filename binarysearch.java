class Node{
    int dat;
    Node left,right;
    Node(int data){
        dat=data;
    }
}
class tree{
    Node root;
public void insert(int data){
root=insertrec(root,data);
}
public Node insertrec(Node root,int data){
    if(root==null){
     root=new Node(data);}
     else if(data<root.dat){
        root.left=insertrec(root.left,data);
     }
     else {
        root.right=insertrec(root.right,data);
     }
     return root;
}
public void inorder(){
    inorderrec(root);
}
public void inorderrec(Node root){
if(root!=null){
    inorderrec(root.left);
    System.out.print(root.dat+"\t");
    inorderrec(root.right);
}
}
public void preorder(){
preorderrec(root);
}
public void preorderrec(Node root){
    if(root!=null){
System.out.print(root.dat+"\t");
preorderrec(root.left);
preorderrec(root.right);
    }
}
public void postorder(){
postorderrec(root);
}
public void postorderrec(Node root){
if(root!=null){
    postorderrec(root.left);
    postorderrec(root.right);
    System.out.print(root.dat+"\t");
}
}
public void Search(int data){
 searchrec(root,data);
}
public void searchrec(Node root,int data){
    if(root==null){
        System.out.println("Root is not found");
    }
    else if(root.dat==data){
     System.out.println("Element is found");
    }
    else if(data<root.dat){
        searchrec(root.left,data);
    }
    else{
        searchrec(root.right,data);
    }
    
}
public void del(int data){
   deletion(root,data);
}
public Node deletion(Node root,int data){
    if(root==null){
        return root;
    }
    else if(data<root.dat){
        root.left=deletion(root.left,data);
    }
    else if(data>root.dat){
        root.right=deletion(root.right,data);
    }
    else{
        if(root.right==null){
            return root.left;
        }
        else if(root.left==null){
            return root.right;
        }
        root.dat=min(root.right);
        root.right=deletion(root.right, root.dat);
    }
     return root;
}
public int min(Node root){
    int minv=root.dat;
    while(root.left!=null){
        minv=root.left.dat;
        root=root.left;
    }
    return minv;
}
}
public class binarysearch {
    public static void main(String[] args){
    tree t=new tree();
    t.insert(5);
    t.insert(1);
    t.insert(0);
    t.insert(2);
    t.insert(7);
    t.insert(6);
    t.insert(8);
    t.inorder();
    System.out.println();
    t.del( 1);
    t.inorder();
    System.out.println();
    
    }
}
